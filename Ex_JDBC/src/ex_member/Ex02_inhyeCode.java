package ex_member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Ex02_inhyeCode {

	public static void main(String[] args) {
		Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        
  Scanner sc = new Scanner(System.in);
  
  while(true) {
     System.out.println("회원관리 프로그램");
     System.out.println("1. 전체 회원조회 2. 회원가입 3. 회원정보 삭제 4. 비밀번호 수정 5. 종료");
     
     int choice = sc.nextInt();
     if( choice == 5) {
        System.out.println("프로그램 종료");
        break;
     }else if(choice == 1) {
        try { 
              Class.forName("oracle.jdbc.driver.OracleDriver");
              
              String user = "service";
              String pw = "12345";
              String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
              
              conn = DriverManager.getConnection(url,user,pw);
              if(conn != null) {
                 System.out.println("연결 성공!");
              }else {
                 System.out.println("연결 실패");
              }
              String sql = "select * from member where id = ?";
              psmt = conn.prepareStatement(sql);
             
              System.out.print("아이디 입력 : ");
              String input_id = sc.next();
              
              psmt.setString(1, input_id);
              
              rs = psmt.executeQuery();
              while(rs.next()) {
                 String get_id = rs.getString("id");
                 String get_pw = rs.getString("pw");
                 String get_name = rs.getString("name");
                 int get_age = rs.getInt("age");
                 System.out.println("id : " + get_id);
                 System.out.println("pw : " + get_pw);
                 System.out.println("name : " + get_name);
                 System.out.println("age : " + get_age);
              }
              System.out.println("=============");
            } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        }finally {
           try {
              if(psmt!=null)psmt.close();
              if(conn!=null)conn.close();
           } catch (SQLException e) {
              e.printStackTrace();
           }
        }
     }else if(choice == 2) {try {
           Class.forName("oracle.jdbc.driver.OracleDriver");

           // DB연결
           String user = "service";
           String pw = "12345";
           String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
           conn = DriverManager.getConnection(url, user, pw);

           if (conn != null) {
              System.out.println("연결 성공");
           } else {
              System.out.println("연결 실패");
           }

           // scanner 사용하기
           Scanner scanner = new Scanner(System.in);
           System.out.print("id 입력 : ");
           String input_id = sc.next();
                 
           System.out.print("pw 입력 : ");
           String input_pw = sc.next();
           
           System.out.print("name 입력 : ");
           String input_name = sc.next();
           
           System.out.print("age 입력 : ");
           int input_age = sc.nextInt();
           
           // sql 통로 열기
           String sql = "insert into member values(?,?,?,?)";
           //? : 쿼리문의 매개변수
           // ㄴ 위치에 따라서 설정이 가능 
           // 예 ) 첫번째 ? : x값을 집어 넣겠다 
           psmt = conn.prepareStatement(sql);
           
           // 물음표 채우는 코드 
           // set 메소드를 통해 값을 설정
           // set 메소드는 psmt 안에 있음 
           // 매개변수2개입 (인덱스 -> 물음표의 위치값, 값) : n번째 물음표에 x값을 넣겠음 
           psmt.setString (1, input_id);
           psmt.setString (2, input_pw);
           psmt.setString (3, input_name);
           psmt.setInt (4, input_age);
           
        
           // sql 통과 할 수 있는 코드
           int row = psmt. executeUpdate();
           if (row>0) {
              System.out.println("insert success");
           }else {
              System.out.println("insert fail");
           }
        } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        }
        // 통로 닫기
        finally {

           try {
              if (rs != null)
                 rs.close();
              if (psmt != null)
                 psmt.close();
              if (conn != null)
                 conn.close();
           } catch (SQLException e) {
              
              e.printStackTrace();
           }

        }
        
     }else if(choice == 3) {try {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // DB연결
        String user = "service";
        String pw = "12345";
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        conn = DriverManager.getConnection(url, user, pw);

        if (conn != null) {
           System.out.println("연결 성공");
        } else {
           System.out.println("연결 실패");
        }
        Scanner sc1 = new Scanner(System.in);
        System.out.print("id 입력 : ");
        String input_id = sc1.next();
        System.out.println("pw 입력 : ");
        
        
        // sql 통로 열기
        String sql = "delete from member where id = ? ";
        psmt = conn.prepareCall(sql);
        psmt.setString (1, input_id);
        
        // sql 통과 코드 작성
        int row = psmt.executeUpdate();
        
        if(row>0) {
           System.out.println("delete success");
        }else {
           System.out.println("delete fail");
        }
     } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
     }
     
     // 통로 닫기
     finally {
        
        try {
           if(psmt != null)psmt.close();
           if(conn != null)conn.close();
           psmt.close();
        } catch (SQLException e) {
           
           e.printStackTrace();
        }
     }
        
     }else if(choice == 4) {try {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // DB연결
        String user = "service";
        String pw = "12345";
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        conn = DriverManager.getConnection(url, user, pw);

        if (conn != null) {
           System.out.println("연결 성공");
        } else {
           System.out.println("연결 실패");
        }
        
        System.out.print("id 입력 : ");
        String input_id = sc.next();
        System.out.print("age 입력 : ");
        int input_age = sc.nextInt();
        
        // sql 통로 열기
        String sql = "update member set age = ? where id =?";
        psmt = conn.prepareCall(sql);
        psmt.setInt (1, input_age);
        psmt.setString(2, input_id);
        
        // sql 통과 코드 작성
        int row = psmt.executeUpdate();
        
        if(row>0) {
           System.out.println("update success");
        }else {
           System.out.println("update fail");
        }
     } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
     }
     
     // 통로 닫기
     finally {
        
        try {
           if(psmt != null)psmt.close();
           if(conn != null)conn.close();
           psmt.close();
        } catch (SQLException e) {
           
           e.printStackTrace();
        }
     }
        
     }else {System.out.println("잘못 눌렀습니다");
        
     }
     }


	}

}
