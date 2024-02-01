package 조건연산자;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int j, k, l, result;
		j = 10;
		k = 20;
		l = 30;
		result = j < k ? k++ : --l;
		System.out.println(result + "," + k+ "," + l); //20
		
		// 문제1
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 수를 입력해 주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("둘째 수를 입력해 주세요 : ");
		int num2 = sc.nextInt();
		int result2 = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		
		System.out.println("결과 : " + result2);
		
		
		// 문제2 짝, 홀 구분.
		System.out.println("첫 수를 입력해 주세요 : ");
		int num3 = sc.nextInt();
		String ck = num3 % 2 == 0 ? "짝수" : "홀수";
		System.out.println(ck);
		
		
		
		
	}

}
