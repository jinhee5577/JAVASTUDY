package Ex페스티벌;

import java.util.Scanner;

public class Java페스티벌02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/// 정수 입력받아 1의 자리 반올림 한 결과
//		System.out.print("정수를 입력해주세요. :");	
//		int num = sc.nextInt();		
//		num.split("");
//		int intValue1 = Integer.valueOf(num).intValue();
//		System.out.println(intValue1);
//		 String str_num = Integer.toString(num); // 숫자 -> 문자
//		 String[] arr_str = str_num.split("");
//		 System.out.println(arr_str[arr_str.length -1]);
		 
//		if (arr_str[arr_str.length -1] >= 5) { // 배열안에 안에 담긴건 문자열이니까
//			arr_str[arr_str.length -2] = arr_str[arr_str.length -2] + 1;
//		} else {
//			arr_str[arr_str.length -1] = 0;
//		}
	 
		
		//----------------------
		System.out.print("숫자 입력 : ");
		int num2 = sc.nextInt();
		
		
		if(num2 % 10 < 5) {
			num2 = num2 - num2 % 10;
		}else {
			num2 = num2 -(num2 % 10) + 10;
		}
		System.out.println("반올림 수 : "+ num2);
	
		
		//------------- 별 1----------------------------
		
		System.out.print("행 개수 :");
		int num3 = sc.nextInt();
		
		for(int i=1; i<=num3; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//------------- 별 2----------------------------
		System.out.print("행 개수 :");
		int num4 = sc.nextInt();
		
		for(int i=1; i<=num4; i++) { // 행출력문.
			for(int j=num4; j>i-1; j--) { // 별 출력문.
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//------------- 최대 공약수 & 최소 공배수 구하기----------------
		System.out.print("숫자1입력>> ");
		int su1 = sc.nextInt();
		System.out.print("숫자2입력>> ");
		int su2 = sc.nextInt();
		
		int a = su1;
		int b = su2;
		while(su2!=0) {
			int temp = su1 % su2;
			su1 = su2;
			su2 = temp;
		}
		int gcd = su1;
		System.out.println("최대공약수: "+gcd);
		
		int lcm = (a * b) / gcd;
		System.out.println("최소공배수: "+lcm);
		
		
		

	}

}
