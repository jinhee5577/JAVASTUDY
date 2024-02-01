import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex04_delete {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		
		// 동적 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// DB연결
			String user = "service";
			String pw = "12345";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			conn = DriverManager.getConnection(url, user, pw); // 커넥션 객체를 리턴한다.
			
			if(conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}
			
			// sql 통로를 만드는코드 -> prepareStatement
			String sql = "delete from member where id = 'test1'";
			psmt = conn.prepareStatement(sql); // psmt : sql 통로를 만드는 길 객체를 뱉어줌.
			
			// sql 통과코드 작성.
			int row = psmt.executeUpdate(); // sql문을 실행시키겠다.
			
			if (row > 0) {
				System.out.println("delete success");
			} else {
				System.out.println("delete fail");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		// 통로 닫기.
		finally {
			try {
				if (psmt != null) psmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		

	}

}
