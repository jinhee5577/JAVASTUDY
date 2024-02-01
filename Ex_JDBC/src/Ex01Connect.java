import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex01Connect {

	public static void main(String[] args) {
		// 1. 데이터베이스 연결
		// 동적로딩 - 내가 어떠한 데이터베이스를 사용할지 작성.
		// Class.forName("어떠한 데이터베이스를 사용할지 문자열로 작성.");
		try { // try - catch문은 예외처리.
			// try -시도하라고 합니다!.
			// 만약에 에러가 나면 catch문 이동. --> catch문 안에 있는 문장이 실행!!.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 에러종류는 2가지
			// 런타임에러 / 컴파일에러
			// 런타임에러  -> 오타.
			// 컴파일에러 -> 실행시 에러. (코드를 잘못짜서)
			
			
			// DB연결. - DriverManager.getConnection(null) 메소드를 실행.
			//(url, db_user, db_pw)
			
			// DB계정 ID, PW
			String user = "service";
			String pw = "12345";
			// url 외우지마세요.
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			// jdbc: orcale:thin -> oracle에서 제공한 주소. 오라클 사용하면 무조건 이거사용.
			// 127.0.0.1 -> localhost  ->내 컴퓨터 ip주소 작성.
			// 1521 -> 오라클사의 포트번호.
			// xe: 현재 사용하고 있는 db버전 이름. 학습용
			
			// SQL문이 통과 할수 있는 통로
			Connection conn = DriverManager.getConnection(url, user, pw); // 연결이 잘됬는지 이걸로 확인.
			// Connection에서 사용할수 있는 메서드 들이 담기게 된다.
			if(conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패!");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		

	}

}
