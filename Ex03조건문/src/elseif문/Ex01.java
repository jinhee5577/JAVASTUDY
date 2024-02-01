package elseif문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//90점 이상 A / 80점이상 B / 70점이상 C / 60점이상 D / 나머지 F
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		// 만약에 조건문1이 참이면 실행문장1이 실행되고 거짓이라면,
		// 조건문2가 참인지 거짓인지 확인한다.
		// 조건문2가 참이면 실행문장 2가 실행 되고, 거짓이라면 
		// else를 만나 실행문장3이 실행된다.

		
		if(score >= 90) {
			System.out.println("A");			
		} else if(score >= 80){
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
	}

}
