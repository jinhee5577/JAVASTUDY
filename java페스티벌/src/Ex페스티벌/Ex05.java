package Ex페스티벌;

import java.util.Random;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("행 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		
//		for(int i = 0; i < input; i++) {
//			for(int j = 0; j<=i; j++ ) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
		
//		for(char ap = 'a'; ap <= 'z'; ap++) {
//			System.out.println(ap);
//		}
		
		
//		String score ="A,A,B,C,D,A,C,D,D,D,F";
//		String[] strarr = score.split(",");
//		int[] arr = new int[5];
//		String[] apb = {"A","B","C","D","F"};
//		int cn=0;
//		for(int i =0; i< strarr.length; i++) {
//			for(int j = 0; j < apb.length; j++) {
//				if(strarr[i].equals(apb[j])){
//					arr[j]++;
//					break;
//				}
//			}
//		}
//		
//		for(int i =0; i <arr.length; i++) {
//			System.out.println(apb[i] +" : "+ arr[i]);
//		}
//		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("base 입력해주세요 : ");
//		int base =sc.nextInt();
//		System.out.print("n 입력해주세요 : ");
//		int n =sc.nextInt();
//		
//		int mul = base;
//		for(int i =1; i < n; i++) {
//			mul *= base;
//			
//		}
//		System.out.println("결과확인 : " + mul);
		
		
//		System.out.print("현재몸무게 입력해주세요 : ");
//		int now_wig = sc.nextInt();
//		System.out.print("목표몸무게 입력해주세요 : ");
//		int goll_wig = sc.nextInt();
//		int wig = 1;
//		
//		while(true) {
//			System.out.print("주차별 감량 몸무게 입력해주세요 : ");
//			int minus = sc.nextInt();
//			System.out.println(wig + "주차 감량 몸무게 : "+ minus);
//			now_wig -= minus;
//			wig++;
//			
//			if(goll_wig >= now_wig) {
//			  System.out.println(goll_wig + "달성!! 축하합니다!!");
//			  break;
//			}
//		}
		
//		System.out.print("정수 입력해주세요 : ");
//		int num = sc.nextInt();
//		
//		if(num % 10 >= 5) {
//			num = num - (num % 10) + 10;
//		}else {
//			num = num - (num % 10);
//		}
//		System.out.println(num);
		
		
		
//		System.out.print("정수 입력해주세요 : ");
//		int n = sc.nextInt();
//		
//		int[][] arr = new int[n][n];
//		int cnt = 1;
		
//		// 입력부
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				arr[i][j] = cnt;
//				System.out.printf("%4d",arr[i][j]);
//				cnt++;
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		// 출력부		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n ; j++) {
//				System.out.printf("%4d",arr[j][i]);
//				cnt++;
//			}
//			System.out.println();
//		}
		
		
//		int[] lotto = new int[6];
//		Random rd = new Random();
//		
//		for(int i =0; i< lotto.length; i++) {
//			int num = rd.nextInt(45);
//			for(int j =0; j< lotto.length; j++) {
//				if(num == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//			lotto[i] = num;
//		}
//		System.out.println();
//		
//		for(int x : lotto) {
//			System.out.println("행운의숫자 : "+ x);
//		}
		
//		System.out.print("정수n 입력해주세요 : ");
//		int n = sc.nextInt();
//		System.out.print("정x 입력해주세요 : ");
//		int x = sc.nextInt();
//		
//		int[] arr = new int[n];
//		
//		for(int i =0; i < arr.length; i++) {
//			System.out.print((i+1) + "번째 정수입력 >>" );
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("결과 :");
//		for(int t : arr) {
//			if(t < x) {
//				System.out.print(t+ " ");
//			}
//		}
		
		
//		System.out.print("정수n 입력해주세요 : ");
//		int num = sc.nextInt();
//		
//		for(int i= 0; i< num; i++) {
//			for(int j= 0; j< num - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		System.out.print("정수 입력해주세요 : ");
//		int n = sc.nextInt();
////		
//		int[][] arr = new int[n][n];
//		int cnt = 1;
//		
//		// 입력부
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				arr[i][j] = cnt;
//				System.out.printf("%4d",arr[i][j]);
//				cnt++;
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		// 출력부		
//		for(int i = 0; i < n; i++) {
//			if(i % 2 == 0 || i == 0) {
//				for(int j = 0; j < n ; j++) {
//					System.out.printf("%4d",arr[i][j]);
//				
//				}
//				System.out.println();
//				
//			} else {
//				for(int j = n-1; j >=0; j--) {
//					System.out.printf("%4d",arr[i][j]);
//					
//				}
//				System.out.println();
//			}
//			
//		}
		
		
//		for(int i =0; i <5; i++) {
//			for(int j =5; j <i; j++) {
//				System.out.print(" ");
//			}
//			
//		}		
////		
//		for(int i =0; i <5; i++) {
//			for(int j =0; j <i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
//		String str ="01001101";
//		String[] strarr = str.split("");
// 		int multi = 1;
//		int sum =1;
//		
//		for(int i=0; i <strarr.length; i++) {
//			sum += Integer.valueOf(strarr[i]) * multi;
//			multi *=2;
//		}
//		
//		
//		System.out.println(str + "(2) : " + sum + "(10)");
		
		
//		System.out.print("정수 입력해주세요 : ");
//		int mony = sc.nextInt();
//		int change = mony;
//		int k = 0;
//		int h = 0;
//		int u = 0;
//		int t = 0;		
//		
//		while(change > 90) {
//			if(change >= 10000) {
//				k = mony / 10000;
//				change = change % 10000;
//			} else if(change >= 5000) {
//				h = change / 5000;
//				change = change % 5000;
//			}else if(change >= 1000) {
//				u = mony / 1000;
//				change = change % 1000;
//			}else if(change >= 500) {
//				t = mony / 500;
//				change = change % 500;
//			}
//			
//		}
//		
//		System.out.println("잔돈: "+ mony);
//		System.out.println( "10000원 : "+ k+ "개");
//		System.out.println( "5000원 : "+ h+ "개");
//		System.out.println( "1000원 : "+ u+ "개");
//		System.out.println( "10000원 : "+ t+ "개");
		
		
		
//		System.out.print("1번째 정수 입력해주세요 : ");
//		int num1= sc.nextInt();
//		System.out.print("1번째 정수 입력해주세요 : ");
//		int num2= sc.nextInt();
		
//		 System.out.println(ck(4,3)); 
		
		int[] arr =new int[5];
		for(int i =0; i< 5; i++) {
			arr[i] =sc.nextInt();
		}
		
		int first=arr[0];
		for(int i =1; i< 5; i++) {
			if(i ==4) {break;}
			if(arr[i] > arr[i+1]) {
				arr[i+1] = arr[i];
			}
		}
		for(int x: arr) {
			System.out.println(x);
					
		}
		
	
		
		
		
	}
	
//	public static boolean ck (int a, int b) {
//	  return a%b == 0? true: false;		 
//	}
	 
	
	

}
