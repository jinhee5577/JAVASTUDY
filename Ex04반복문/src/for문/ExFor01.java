package for문;

import java.util.Scanner;

public class ExFor01 {

	public static void main(String[] args) {
		// for문 예제
		// for(초기화구문; 검사조건; 반복후 작업){
		//   검사조건이 true일대 실행문;
	    // }

//		for(int i=21; i <= 57; i++) {
//			System.out.print(i+ " ");
//		}
//		System.out.println();
//		
//		for(int i=96; i >= 53; i--) {
//			System.out.print(i+ " ");
//		}
//		System.out.println();
//		
//		for(int i=21; i <= 57; i +=2) {
//			System.out.print(i+ " ");
//		}
		
		
		// 다음 문제.
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫째수 입력해 주세요 >> ");
//		int num1 = sc.nextInt();
//		System.out.print("둘째수 입력해 주세요 >> ");
//		int num2 = sc.nextInt();
//		
//		if(num1 < num2) {
//		   for(int i = num1; i <= num2; i++) {
//			   System.out.print(i + " ");
//		   }
//		} else {
//			for(int i = num2; i <= num1; i++) {
//			   System.out.print(i + " ");
//		   }
//		}
//		
		
		// for문 예제3		
		System.out.print("첫째수 입력해 주세요 >> ");
		int num3 = sc.nextInt();
		System.out.print("둘째수 입력해 주세요 >> ");
		int num4 = sc.nextInt();
		int sum = 0;
		
		if(num3 < num4) {
		   for(int i = num3; i <= num4; i++) {
//			   sum += i;
			   sum = sum + i;
		   }
		} else {
			for(int i = num4; i <= num3; i++) {
			   sum += i;
			}
		}
		System.out.println(sum);
		
		
	}

}
