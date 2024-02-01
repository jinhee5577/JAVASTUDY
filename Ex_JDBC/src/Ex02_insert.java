import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex02_insert {

	public static void main(String[] args) {
		// 연결 시도 - 동적로딩.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// DB연결 - DriverManager.getConnection(url,user,pw) 메소드를 실행.
			String user = "service";
			String pw = "12345";
			// url 외우지마세요.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			Connection conn	= DriverManager.getConnection(url,user,pw);
			// 연결이 성공하면 conn에 객체가 담긴다.
			if(conn != null) {
				System.out.println("연결 성공!");
			} else {
				System.out.println("연결 실패!");
			}
			
			// insert 구문 작성
			
			// sql문 통과 할수 있는 통로를 열어보자.
			// 통로의 이름: PreparedStatment
			// 통로를 열수 있도록 샐행코드 --> Connection 안에 있습니다!.
			// 실행코드의 이름: prepareStatement(매개변수 sql문 작성)
			// prepareStatement => sql문이 통과할수 있는 통로.
			
			String sql = "insert into member values('test3', '456123', '배인혁', 29)";
			PreparedStatement psmt = conn.prepareStatement(sql); // SQL문이 통과할수 있는 통로가 열리는 코드. 이동코드?.
			
			// sql문 이동 코드 작성하기.
			// sql문 이동코드 -> PrepareStatement 안에 있습니다!.
			// 이동코드 이름: executeUpdate(), executeQuery()
			int row = psmt.executeUpdate(); // 해당 데이터문이 sql로 이동한다. 실행해라.
			
			// executeUpdate -> int를 리턴!.
			// int를 리턴하는 이유: 실행 문장수를 DB가 뱉어줍니다!.
			if(row > 0) { // 정상적인 실행이 일어나고 있다.
				System.out.println("insert success");
			}else {
				System.out.println("insert fail");
			}
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}
