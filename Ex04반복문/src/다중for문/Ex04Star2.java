package 다중for문;

import java.util.Scanner;

public class Ex04Star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  공백 0 -> 4 까지 1씩 증가.
		// 별 5 -> 1까지 1씩 감소.
		
//		for(int i =1; i< 1; i++) { // 공백을 0개 출력해주는 for문
//			System.out.print(" ");			
//		}
//		for(int i = 5; i>=1; i--) { //별 5개 출력해주는 for문
//			System.out.print("*");
//		}
//		System.out.println();
//		//-----------------------------------
//		
//		for(int i =1; i< 2; i++) { // 공백을 1개 출력해주는 for문
//			System.out.print(" ");
//		}
//		for(int i = 5; i>=2; i--) { //별 4개 출력해주는 for문
//			System.out.print("*");
//		}
//		System.out.println();
//		//-----------------------------
//		
//		for(int i =1; i< 3; i++) { // 공백을 2개 출력해주는 for문
//			System.out.print(" ");
//		}
//		for(int i = 5; i>=3; i--) { //별 3개 출력해주는 for문
//			System.out.print("*");
//		}
//		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행갯수 : ");
		int row = sc.nextInt();	
		
		for(int h = 0; h < row; h++) {
			for(int i =1; i< (h+1); i++) { // 공백을 2개 출력해주는 for문
				System.out.print(" ");
			}
			for(int i = 5; i>=(h+1); i--) { //별 몇개 출력해주는 for문
				System.out.print("*");
			}		
			System.out.println();
		}
		
		
	
		
		
		
		
		// 1행
//	//	System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		
//		// 2행
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		
//		// 3행.
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		
//		//4행
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		
//		//5행
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.println();
		

	}

}
