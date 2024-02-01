package 산술연산자;

import java.util.Scanner;

public class Ex03time {

	public static void main(String[] args) {
	   // 심화 문제.
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 초: ");
		int time = sc.nextInt();
		int hour = time/60/60; //60
		int minute = (time/60) % 60; // 60분이 1시간 이니까 60으로 나눈 나머지 =>분 
		int second = time % 60; // 60chrk 1분이니까 60으로 나눈 나머지 => 초
		System.out.println(hour + "시간" + minute +"분" + second + "초");
		
		
		
		
		

	}

}
