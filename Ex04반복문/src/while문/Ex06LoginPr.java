package while문;
import java.util.Scanner;

public class Ex06LoginPr {
	
	public static void main(String[] args) {
		// 예제 4번 로그인 코드/ 1. 사용자 입력받기.
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		boolean run = true; // 시스템 제어 
		
		while(run){
			System.out.print("ID : ");
			String id = sc.next();			
			System.out.print("PW : ");
			String pw = sc.next();
			
			// 로그인 성공의 경우 
			if(id.equals("user") && pw.equals("pass")) {
				System.out.println("로그인 성공!!");
				break;
			} else { // 로그인 실패시
				System.out.println("로그인 실패 입니다!");
				cnt++;
			}
			
			if(cnt >= 3) {
				System.out.println("본인인증을 해주세요.");
				break;
			}
			while(true) { // 계속 로그인 진행할것인지 묻는 구문.
				System.out.println("계속 하시겠습니까> (Y/N)");
				String yesNo = sc.next();
				
				if(yesNo.equals("N") || yesNo.equals("n")) { // 사용자가 N 선택할 경우
					run = false; // 밖의 while빠져 나가기위해 false로 변경.
					break;
				} else if(yesNo.equals("y") || yesNo.equals("Y")) {// 사용자가 y 선택할 경우
					break;
				} else { // 그외 다른잘못된 선택을 할경우
					System.out.println("잘못된 입력니다.");
				}
			}
			
		}
		
		
	}

}
