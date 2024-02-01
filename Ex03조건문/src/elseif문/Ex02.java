package elseif문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// id, 비밀번호 검사하기.
		// ID가 ‘user’이고 password가 ‘pass’이면 로그인에 성공하였습니다”를 출력하고
		// 아이디가 일치하지 않으면 “아이디가 일치하지 않습니다.”
		// 비밀번호가 일치하지 않으면 “비밀번호가 일치하지 않습니다.”를 출력하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		// 상수 선어 => 바뀌지 않는 값이기 때문.
		final String ID = "user"; 
		final String PASS = "pass";
		
		System.out.print("ID 입력해주세요. :");
		String input_id = sc.next();
		System.out.print("password 입력해주세요. :");
		String input_password = sc.next();
		
		// 문자열끼리 비교하기 때문에 input_id.equals("user")이렇게 비교해야함.
		if(input_id.equals(ID)&& input_password.equals(PASS)) {
		  System.out.println("로그인 성공하셨습니다.");
		} else if(input_id != "user" && input_password.equals(PASS)) {
			System.out.println("id 불일치 합니다.");
		} else if (input_password != "pass" && input_id.equals(ID)) {
			System.out.println("password 불일치 합니다.");
		}else {
			System.out.println("id, pw 모두 다릅니다.");					
		}
		
		
		if(!input_id.equals(ID) && input_password.equals(PASS)) {
			System.out.println("id 불일치 합니다.");
		}
		
			
		
		


	}

}
