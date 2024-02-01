import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex05_select {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		
		// 동적 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 어떠한 데이터베이스를 사용하겠다.
			
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
			String sql = "select * from member";
			psmt = conn.prepareStatement(sql); // psmt : sql 통로를 만드는 길 객체를 뱉어줌.
			
			// sql 통과코드 작성. ->  통과하세요. 코드 작성.
			// insert, delete, update --> psmt.executeUpdate(); 사용해옴. 단순히 숫자만 가지고옴.
			// select - psmt.executeQuery()
			// 왜?? --> 결과값을 가지고 올수 있는 통로가 필요해짐!.
			// 통로는 1개의 역활만 가능.
			// Connection - 연결 기능. db랑 java연결기능.
			// PreparedStatement - sql 이동기능.
			// ResultSet 통로 - select 결과값을 담아서 가지고오는 기능!.
			// 커서객체 ->
			
			// ResultSet psmt안에 있다.
			ResultSet rs = psmt.executeQuery(); // sql문을 실행하라. select에서만 사용함. select문 통과 시키는 코드
			// rs.next(); : select 결과값에 데이터 유무를 보는 함수._있으면 true
			// 반환타입 boolean: 한줄의 데이터가 있으면 true, 없으면 false.
			// true일시 다음줄의 데이터 유무를 확인.
			
			while(rs.next()) { // 데이터가 false일때까지 알기 위해서.
				String select_id = rs.getString("id"); // ("컬럼명") 써준다.
				String select_pw = rs.getString("pw"); // ("컬럼명") 써준다.
				String select_name = rs.getString("name"); // ("컬럼명") 써준다.
				int select_age = rs.getInt("age");
				
				System.out.println("id : " + select_id);
				System.out.println("pw : " + select_pw);
				System.out.println("name : " + select_name);
				System.out.println("age : " + select_age);
				
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
