package 다중for문;

import java.util.Scanner;

public class Ex03star {

	public static void main(String[] args) {
		// 별그리기. 도전
		// *
		// * *
		// * * *
		// * * * *
		// ....(사용자의 입력한 숫자만큼)
		Scanner sc = new Scanner(System.in);
		System.out.print("행갯수 : ");
		int row = sc.nextInt();
		
		for(int j= 0; j < row; j++) {
			for(int i= 0; i < j+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
//		for(int i=1; i <= 5; i++) {
//			System.out.println("*");
//			for(int j=0; j <= 4; j++) {
//				System.out.print("*");
//			}
//		}

	}

}
