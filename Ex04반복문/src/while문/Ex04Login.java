package while문;

import java.util.Scanner;

public class Ex04Login {

	public static void main(String[] args) {
		// 로그인 문제 
		Scanner sc = new Scanner(System.in);
		
		String id = "hello";
		String pw = "1234";
		String an = "y";
		
		System.out.print("아이디를 입력해 주세요 >> ");
		String user_id = sc.next();
		System.out.print("비밀번호를 입력해 주세요 >> ");
		String user_pw = sc.next();
		
		
		while(!id.equals(user_id) || !pw.equals(user_pw)) {
			System.out.println("아이디와 비밀번호가 잘못 입력하셨습니다.");
			System.out.print("계속 하시겠습니까? (Y/N) >>");
			String anw = sc.next();
			if(!an.equals(anw)) { 
				System.out.println("종료합니다.");
				break;
		    }
			
			System.out.print("아이디를 입력해 주세요 >> ");			
			user_id = sc.next();
			System.out.print("비밀번호를 입력해 주세요 >> ");
			user_pw = sc.next();
			
			if(id.equals(user_id) && pw.equals(user_pw)) {
				System.out.println("로그인 성공!!");
				break;
			}
		}
		
		// 쌤풀이	      
	      String id2 = "Hello";
	      String pw2 = "1234";
	      String answer;
	      
	      while(true) {
	         
	         System.out.print("아이디를 입력해주세요 >> ");
	         String input_id = sc.next();
	         System.out.print("비밀번호를 입력해주세요 >> ");
	         String input_pw = sc.next();
	         
	         if(input_id.equals(id2) && input_pw.equals(pw2)) {
	            // 로그인 성공
	            System.out.println("로그인 성공");
	            break;
	         }
	         
	         System.out.print("계속 하시겠습니까?(Y/N) >> ");
	         answer = sc.next();
	         
	         if(answer.equals("N")) {
	            System.out.println("종료합니다");
	            break;
	         }
	         
	         
	      }
		
		

	}

}
