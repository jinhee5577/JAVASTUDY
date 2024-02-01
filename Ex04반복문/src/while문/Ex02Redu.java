package while문;

import java.util.Scanner;

public class Ex02Redu {

	public static void main(String[] args) {
		// while문 예제2
		
		Scanner sc = new Scanner(System.in);		
		boolean bool = true;		
		int reduce = 0;
		
//		while(bool) {
//			if(reduce == -1) { break; }
//			System.out.println("숫자 입력해주세요. :");
//			int num = sc.nextInt();
//			reduce += num;			
//		}
//		System.out.println("프로그램 종료 되었씁니다.");
		
		// 2while문
		int input = 0;
		while(input != -1) {
			System.out.println("숫자입력 : ");
			input = sc.nextInt();
			reduce += input;
			System.out.println("누적결과 : "+ reduce);
		}
		System.out.println("종료 되었습니다.");
		
		
		// 홀수 짝수 문제
		boolean bool2 = true;
		int even = 0;
		int odd = 0;
		String st = null;
		
		while(bool2) {
			System.out.println();
			System.out.println("숫자 입력해주세요. :");
			int num2 = sc.nextInt();
			if(num2 == -1) {
				System.out.println("종료 되었씁니다."); 
				break; 
		    }
			if(num2 % 2 == 0) { even++; st = "짝수";}
			else { odd++; st = "홀수"; }
			System.out.println(st + "개수:" +(num2 % 2 == 0 ? even: odd));
			
		}

	}

}
