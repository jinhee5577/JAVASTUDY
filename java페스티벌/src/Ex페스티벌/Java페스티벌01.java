package Ex페스티벌;

import java.util.Scanner;

public class Java페스티벌01 {

	public static void main(String[] args) {
		// 자바페스티벌 시급 계산기
		Scanner sc = new Scanner(System.in);
//		System.out.print("일한 시간을 입력해주세요. :");
//		int time = sc.nextInt();
//		int total = 0;
//		int remain_time = 0;		
//		
//		if(time > 8) {
//			total += 8 * 5000;
//			remain_time = time - 8;
//			total += remain_time * (5000 * 1.5);
//		} else {
//			total = time * 5000;
//		}
//		System.out.println(total);
		
		
	// ---------------------------------
		
		// 자바페스티벌 거스름돈 지폐 갯수
//		System.out.println("금액을 입력해주세요. :");
//		int mony = sc.nextInt();
//		int cash = mony;
//		int M_Changes = 0;
//		int B5_Changes = 0;
//		int C_Changes = 0;
//		int B1_Changes = 0;
//		
//		while(cash > 400) {
//			if(cash >= 10000) {
//			   M_Changes = cash / 10000;
//			   cash = cash % 10000;
//			} else if(cash >= 5000) {
//				B5_Changes = cash / 5000;
//				cash = cash % 5000;
//			} else if(cash >= 1000) {
//				C_Changes = cash / 1000;
//				cash = cash % 1000;
//			} else if(cash >= 500) {
//				B1_Changes = cash / 500;
//				cash = cash % 500;
//			}
//		}
//		System.out.println("잔돈: "+mony+"원 10000원 : "+M_Changes+"개 5000원 :"
//			+ B5_Changes+"개 1000원"+ C_Changes+ "개 500원"+ B1_Changes+ "개");
//		
		
		//  수열n번째항 구하기 1,2,4,7,11 같은수 의 n번째항 출력,
		
		System.out.print("정수를 입력해주세요. :");
		int intNUM = sc.nextInt();
		int[] arr = new int[intNUM];
		arr[0] = 1;
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = arr[i-1] + i; 
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ ", ");			
		}
		
		
		// 두숫자 거리비교.
//		int[] point = {92,32,52,9,81,2,68};
		
		
		
		
		
		
		

	}

}
