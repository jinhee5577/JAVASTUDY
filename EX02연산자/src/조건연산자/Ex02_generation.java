package 조건연산자;

import java.util.Scanner;

public class Ex02_generation {

	public static void main(String[] args) {
		// 사용자의입력을 받아서 10세미만은 어린이, 20세 미만은 청소년,
		// 35세 미미은 청년, 그이상은 중장년으로 출력하기.
		
		// 1.사용자의 입력받기.
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String any = age < 35 ? (age<20 ? "청소년" : "청년") : "중장년";
		System.out.println(any);
		
		
		// 쌤풀이
		String gen;
		gen = age < 10? "어린이":
			  age < 20 ? "청소년" : 
			  age < 30 ? "청년" : "중장년";
		System.out.println(gen);
			  
		
	}

}
