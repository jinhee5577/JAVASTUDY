import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex03_update {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;

		// 동적로딩
		try {
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

			String sql = "UPDATE MEMBER SET NAME ='test5' WHERE ID = 'test'";
			psmt = conn.prepareStatement(sql);

			// sql이 통과할수 있는코드.
			int row = psmt.executeUpdate();
			System.out.println(row);

			if (row > 0) {
				System.out.println("update success");
			} else {
				System.out.println("update fail");
			}

			// 닫기 - 한줄 실행할때마다 닫아주어야 한다.
			// 통로를 모두 닫을거야!.
			// psmt - sql문 통과할수 잇는 통로
			// conn - db - java 연결 통로
			// 다 닫게 되면 자동으로 커밋이 된다.

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. DB종료,  문닫기.
			// 열고 닫고 열고 닫고 해주어야 효율성이 크다..
			// 주의사항
			// psmt 통로는 conn안에 있습니다.
			// 통로를 연 역순으로 닫아주어야 한다!!.
			// 통로를 연순서 - conn - psmt
			try {
				if (psmt != null) psmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
