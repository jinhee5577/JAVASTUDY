package ex_member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_member {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        
        //
        
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//DB연결
           String user = "service";
           String pw = "12345";
           String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
           conn = DriverManager.getConnection(url,user, pw);
           
           if(conn!= null) {
              System.out.println("연결 성공");
           }else {
              System.out.println("연결 실패");
           }
			
           while(true) {
   			System.out.println("회원관리 프로그램");
   			System.out.println("1.전체 회원 조회 2.회원가입, 3.회원정보 삭제 4. 비밀번호 수정 5. 종료");
   			
   			int choice = sc.nextInt();
   			if(choice == 5){
   				System.out.println("프로그램 종료");
   				break;
   			}else if(choice == 1) { //1.전체 회원 조회 -- select 문과 관련(Ex05,Ex06참고)
    			   // sql문 통로
   	           String sql = "select * from member";
   	           psmt = conn.prepareStatement(sql); // 통로를 연것이다
   	           
   	           // ?채우기 -- ? 없으면 생략.

   	           // sql 통과코드
   	           rs = psmt.executeQuery();
   	           // select 한줄의 데이터 확인 rs.next()
   	           while(rs.next()) { // rs.next() 데이터 한줄을 가져옴.
   	        	  String get_id  = rs.getString("id");
   	        	  String get_pw  = rs.getString("pw");
   	        	  String get_name  = rs.getString("name");
   	        	  int get_age  = rs.getInt("age");
   	        	  
   	        	  System.out.print("id :" + get_id);
   	        	  System.out.print("pw :" + get_pw);
   	        	  System.out.print("name :" + get_name);
   	        	  System.out.print("age :" + get_age);
   	        	  System.out.println("=======================");
   	           }
   				
   			}else if(choice == 2) { // 2.회원가입
   			   System.out.println("회원가입 페이지 입니다.");	 
   	           System.out.print("id 입력: ");
   	           String input_id = sc.next();
   	           
   	           System.out.print("pw 입력: ");
   	           String input_pw = sc.next();
   	           
   	           System.out.print("name 입력: ");
   	           String input_name = sc.next();
   	           
   	           System.out.print("age 입력: ");
   	           int input_age = sc.nextInt();
   	           
   	           
   	           // sql통로 열기
   	           String sql = "insert into member values(?,?,?,?)";
   	           // ? : 쿼리문의 매개변수
   	           // 위치에 따라서 설정이 가능.
   	           // 예). 첫번째 ? :x값을 집어 넣겠다!. 위치로 확인.
   	           psmt = conn.prepareStatement(sql); // 통로를 연것이다.
   	           
   	           // 물음표 채우는 코드.
   	           // set메소드를 통해서 값을 설정 해줄꺼야.
   	           // set메서드는 psmt안에 있다.
   	           // 매개변수 2개입력 (인덱스 --> 물음표의 위치값, 값) : n번재 물음표에 x값을 넣겠다.
   	           // ? 위치는 1번부터 시작.
   	           psmt.setString(1, input_id);
   	           psmt.setString(2, input_pw);
   	           psmt.setString(3, input_name);
   	           psmt.setInt(4, input_age);
   	           
   	           // sql 통과할수 있는코드
   	           int row = psmt.executeUpdate(); // sql문을 실행하라.
   	           if(row > 0) {
   	        	   System.out.println("insert 성공");
   	           } else {
   	        	   System.out.println("insert 실패");
   	           }
   							
   			}else if(choice == 3) { // 3. 회원정보 삭제
   				System.out.println("회원 정보 삭제 페이지 입니다.");
   				System.out.print("삭제할 id를 입력 하세요.: ");
   	           String input_id = sc.next();
   	           
   	           // sql통로 열기
       //      String sql = "delete from member where id ='" + input_id+"'";
   	           String sql = "delete from member where id = (?)";
   	           // ? : 쿼리문의 매개변수
   	           // 위치에 따라서 설정이 가능.
   	           // 예). 첫번째 ? :x값을 집어 넣겠다!. 위치로 확인.
   	           psmt = conn.prepareStatement(sql); // 통로를 연것이다.
   	           psmt.setString(1, input_id);
   	           
   	           // 물음표 채우는 코드.
   	           // set메소드를 통해서 값을 설정 해줄꺼야.
   	           // set메서드는 psmt안에 있다.
   	           // 매개변수 2개입력 (인덱스 --> 물음표의 위치값, 값) : n번재 물음표에 x값을 넣겠다.
   	           // ? 위치는 1번부터 시작.
   	           
   	           // sql 통과할수 있는코드
   	           int row = psmt.executeUpdate(); // sql문을 실행하라.
   	           if(row > 0) {
   	        	   System.out.println("delete 성공");
   	           } else {
   	        	   System.out.println("delete 실패");
   	           }
   	           
   			}else if(choice == 4) { // 4. 비밀번호 수정
   				System.out.println("회원정보 수정 페이지 입니다.");
   				System.out.print("id 입력: ");
   	           String input_id = sc.next();
   	           
   	           System.out.print("비밀번호 입력: ");
   	           String input_pw = sc.next();   	           
   	           
   	           // sql통로 열기
   	    //     String sql = "delete from member where id ='" + input_id+"'";
   	           String sql = "update member set pw = (?) where id = (?)";
   	           // ?가 있는 경우! 먼저 채워줘라!.
   	           // ? : 쿼리문의 매개변수
   	           // 위치에 따라서 설정이 가능.
   	           // 예). 첫번째 ? :x값을 집어 넣겠다!. 위치로 확인.
   	           psmt = conn.prepareStatement(sql); // 통로를 연것이다.
   	           psmt.setString(2, input_id);
   	           psmt.setString(1, input_pw);   	           
   	           
   	           // 물음표 채우는 코드.
   	           // set메소드를 통해서 값을 설정 해줄꺼야.
   	           // set메서드는 psmt안에 있다.
   	           // 매개변수 2개입력 (인덱스 --> 물음표의 위치값, 값) : n번재 물음표에 x값을 넣겠다.
   	           // ? 위치는 1번부터 시작.
   	           
   	           // sql 통과할수 있는코드
   	           int row = psmt.executeUpdate(); // sql문을 실행하라.
   	           if(row > 0) {
   	        	   System.out.println("update 성공");
   	           } else {
   	        	   System.out.println("update 실패");
   	           }
   				
   			}else {
   				System.out.println("잘못 눌렀습니다!.");
   			}
   		}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
        finally {
            try { //역순으로 닫아야겠지.
               if(rs != null) rs.close();	  
               if(psmt != null)psmt.close();
               if(conn != null) conn.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         
      }

	}

}
