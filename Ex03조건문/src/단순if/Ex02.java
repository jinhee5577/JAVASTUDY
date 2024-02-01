package 단순if;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// main 메소드 만들기 main 컨트롤 + 스페이스바.
		// 컨트롤 + 쉬프트 + f => 자동 코드 정렬.

		// int 타입의 num을 선언. 그리고 키보드로 값을 입력받아서.
		// num이 3과 5의 배수라면 "3과 5의 배수입니다." 출력.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요. : ");

		int number = sc.nextInt();
		if (number % 3 == 0 && number % 5 == 0) { // if(num % 15 == 0)
			// 증산비논조대
			System.out.println("3과 5의 배수 입니다.");
		} else {
			System.out.println("3과 5의 배수 아닙니다.");
		} // if문의 끝
			
		
		
		

	} // 메서드의 끝
} // class 끝
