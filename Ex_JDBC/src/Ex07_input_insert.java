import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex07_input_insert {
	// 전체 import = 컨트롤 + 쉬프트 + O;

	public static void main(String[] args) {
		Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        
        //동적 로딩 
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
           
           // 스캐너 열기 사용하기.
           Scanner sc = new Scanner(System.in);
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
           
           
           
           
           
                    
        } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        }
        //통로 닫기
        finally {
           
              try {
                 if(rs != null)rs.close();
                 if(psmt != null)psmt.close();
                 if(conn != null) conn.close();
              } catch (SQLException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
              }
           
        }

	}

}
