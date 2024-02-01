package 다중for문;

import java.util.Scanner;

public class Ex04Sum {

	public static void main(String[] args) {
		// for문 예제2 문제  3문제
		
		// 1).
		int sum = 0;
		for(int i= 1; i <=100; i++) {
			sum += i;			
		}
		System.out.println(sum);
		
		// 2).
		int sum2 = 0;
		for(int i= 1; i <=100; i++) {
			if(i%2 == 0) { sum2 -= i; }
			else { sum2 += i; }
		}
		System.out.println(sum2);
		
		// 3).
		int cnt = 1;
		int sum3 = 0;
		for(int i =77; i >= 1; i--) {			
			sum3 +=(i * cnt);
			cnt++;
		}
		System.out.println(sum3);
		
		
		
		// 큰 예제 3). 거듭제곱
		Scanner sc = new Scanner(System.in);
		System.out.print("base : ");
		int base = sc.nextInt();
		
		System.out.println("n : ");
		int n = sc.nextInt();
		
		int total = base;
		for(int i =1; i < n; i++) {
			total *= base;			
		}
		System.out.println("result :" + total);
		
		
		
		
		
		
		
		
		
	}

}
