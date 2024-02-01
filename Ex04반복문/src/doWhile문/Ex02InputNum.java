package doWhile문;

import java.util.Scanner;

public class Ex02InputNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// do-while문을 사용해서
		// 0을 입력하기 전까지 계속해서 숫자 입력받기
		// 만약에 0을 입력하면 "프로그램 종료" 출력.
		
		int num;
		
		do {
			System.out.print("숫자 입력하세요 :");
			num = sc.nextInt();
			System.out.println(">"+ num);
		} while(num != 0);
		System.out.println("프로그램 종료 합니다.");
		
		
		// 몸무게 관리 프로그램.
		// 현재 몸무게 담는 변수
		// 목표 몸무게를 담는 볁수
		// 주차마다 뺀 몸무게를 담는 변수
		// 주차를 셀수 있는 변수
		int now_weight = 0;
		int target_weught = 0;
		int wei;
		int week = 0;
		
		System.out.print("현재 몸무게를 입력하세요. :");
		now_weight = sc.nextInt();
		System.out.print("목표 몸무게를 입력하세요. :");
		target_weught = sc.nextInt();	
		System.out.print("주차별 뺀몸무게를 입력하세요. :");
		
		while(true) {
			// 주차별 뺀 무게.
			wei = sc.nextInt();
			week++;
			System.out.println(week+"주차 감량 몸무게: "+ wei);
		//	System.out.println(++week+"주차 감량 몸무게: "+ wei); // 오 이렇게써도됨.
			now_weight -= wei;
			
			if(target_weught > now_weight) {
				System.out.println(target_weught+ "kg달썽 !! 축하합니다!");
				break;
			}				
		}
		
		
		// 쌤풀이 방법
		// 현재 몸무게를 담는 변수
	      int pw;
	      // 목표 몸무게를 담는 변수
	      int gw;
	      // 주차마다 뺀 몸무게를 담는 변수
	      int wei2;
	      // 주차를 샐 수 있는 변수
	      int num2 = 0;
	      
	      System.out.print("현재몸무게 : ");
	      pw = sc.nextInt();
	      System.out.print("목표몸무게 : ");
	      gw = sc.nextInt();
	      
	      do {
	         System.out.print(++num2 + "주차 감량 몸무게 : ");
	         wei2 = sc.nextInt();
	         
	         pw -= wei2;
	         
	      }while(pw >= gw);
	      
	      System.out.println(pw + "kg 달성! 축하합니다!");
				

	}

}
