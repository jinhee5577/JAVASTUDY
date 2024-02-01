package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.MemberDTO;

public class MemberDAO {
	// 데이터를 접근해서 가져오자.
	private Connection conn; // 이안에서만 접근 가능.
	private PreparedStatement psmt; // 이안에서만 접근 가능.
	private ResultSet rs; // 이안에서만 접근 가능.
    
	// DAO란?
    // DAO의 역할 모델단 => 데이터베이스 접근하고 데이터베이스 값을 가져오고.
	// Data Access Object
	// 데이터 접근 객체.
	// 데이터베이스에 접근하여 insert,delete, update, select할 예정
	
	// DAO 객체 특징
    // 테이블 1개당 1개의 DAO객체를 가지고 있다.
	// 모든 기능은 메서드로 작성하게 된다.
	
	// 객체 지향 프로그래밍
	// 객체간 서로 메세지를 주고 받는 프로그래밍. // 파라미터로 넘긴다.
	
	// Connect 메소드 
	private void getConn() { // 외부에서 접근 못하게 숨겨버리자.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String user = "service";
	        String pw = "12345";
	        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	                             
	        conn = DriverManager.getConnection(url, user, pw);
	        if(conn != null) {
	           System.out.println("연결 성공");
	        }else {
	           System.out.println("연결 실패");
	        }
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	// close하는 메서드
	private void allClose() { // 외부에서 접근 못하게 숨겨버리자.
	  try {
         if(rs!= null)rs.close(); // close()에서 SQLException에러가 발생할수 있어서 아래 catch문에서 에러 받아준다.
         if(psmt != null)psmt.close(); // close()에서 SQLException에러가 발생할수 있어서 아래 catch문에서 에러 받아준다.
         if(conn!= null) conn.close(); // close()에서 SQLException에러가 발생할수 있어서 아래 catch문에서 에러 받아준다.
      } catch (SQLException e) { // close()에서 SQLException에러가 발생할수 있어서 요기 catch문에서 에러 받아준다.
         e.printStackTrace();
      }
	}
		
	
	// delete기능 메서드
	public int deleteMember(String delete_id) {
        // deletet문 
		getConn();
        
        try {
           //sql통과 통로
           String sql = "delete from member where id = ?";
           psmt = conn.prepareStatement(sql);
           
           //?채우기 - ?가 없으면 생략 
           psmt.setString(1, delete_id);
           //sql통과 하세요!
           int row = psmt.executeUpdate();
           return row; // 정상적인 행의 갯수 뱉어라.           
           
        } catch (SQLException e) {
           e.printStackTrace();
           return 0; //실행문이 없다. -1도 상관없다.
        }finally {
           allClose();
        }
	}
	
	
	// update기능 메서드
	public int updateMember(String update_id, String update_pw) {
		getConn();
		
		try {
           //sql통과 통로
           String sql = "update member set pw = ? where id = ?";
           psmt = conn.prepareStatement(sql);
           
           //?채우기 - ?가 없으면 생략 
           psmt.setString(1, update_pw);
           psmt.setString(2, update_id);
           
           //sql통과 하세요!
           int row = psmt.executeUpdate();
           return row;
           
        }catch (SQLException e) {
           e.printStackTrace();
           return 0;
        }finally {
          allClose();
        }
	}

	
	// insert기능 메서드
	public int insertMember(MemberDTO mdto) {
		getConn();
		
		try {
           //sql통과 통로
           String sql = "insert into member values(?,?,?,?)";
           psmt = conn.prepareStatement(sql);
           
           //?채우기 - ?가 없으면 생략 
           psmt.setString(1, mdto.getId());
           psmt.setString(2, mdto.getPw());
           psmt.setString(3, mdto.getName());
           psmt.setInt(4, mdto.getAge());
           
           //sql통과 하세요!
           int row = psmt.executeUpdate();
           return row;           
           
        } catch (SQLException e) {
           e.printStackTrace();
           return 0;
        }finally {
          allClose();
        }
	}
	
	
	// select기능 메서드
	public ArrayList<MemberDTO> selectMember () {
        //전체회원 조회 -- select 문과 관련 (Ex05, Ex06참고)
        //동적로딩
		ArrayList<MemberDTO> dtoList = new ArrayList<MemberDTO>();
		
		getConn();
        try {
           //sql통과 통로
           String sql = "select * from member";
           psmt = conn.prepareStatement(sql);
           
           //?채우기 - ?가 없으면 생략 
           
           //sql통과 하세요!
           rs = psmt.executeQuery();
           
           //select 한줄의 데이터 확인 rs.next()
           // 이게 핵심.
           while(rs.next()) {
              String id = rs.getString(1);
              String table_pw = rs.getString(2);
              String name = rs.getString(3);
              int age = rs.getInt(4);
              MemberDTO mdto = new MemberDTO(id,table_pw, name, age);
              dtoList.add(mdto);
           }
           
           return dtoList;
        } catch (SQLException e) {
           e.printStackTrace();
           return null;
        }finally {
           allClose();
        }
        
	}

	// SearchMember기능 메소드.
	public ArrayList<MemberDTO> selectSearchMember(String family_name) {
		// 동적 로딩
		// db연결
		getConn();
		
		ArrayList<MemberDTO> dtoList = new ArrayList<MemberDTO>();
		
		// sql통로 - psmt
		String sql = "select * from member where name like ?";
		// 2번 방법은 sql문 내에 %입력
		// "select * from member where name like '%' || ? || '%'" 더 복잡하네...
		try {
			psmt = conn.prepareStatement(sql);
			
			// ?채워주기 -- like문 같은 경우 %가 필요.
			// 2가지 방법
			// 1번 방법이 간단.
			// psmt.set타입 (index, "%" + 변수 + "%")
			psmt.setString(1, "%" + family_name + "%"); // 박00,0박0 둘다 찾음.
			psmt.setString(1, family_name + "%");  // 이거는 --> 박00 만 찾음. 
			
			// SQL문 실행 
			rs = psmt.executeQuery();
			while(rs.next()) {
				String select_id = rs.getString(1);
				String select_pw = rs.getString(2);
				String select_name = rs.getString(3);
				int select_age = rs.getInt(4);
				
				MemberDTO mdto = new MemberDTO(select_id,select_pw,select_name, select_age);
				dtoList.add(mdto);
			}
			return dtoList;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			allClose();
		}
		
	}
	
	
	
}






