package if_else문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//90점 이상 A / 80점이상 B / 70점이상 C / 60점이상 D / 나머지 F
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score >= 90) { // 이렇게 쓰면 서능도 매우 떨어짐.
			System.out.println("A");
		} else {
			if(score >= 80){
				System.out.println("B");
			}if(score >= 70){
				System.out.println("C");
			}			
		}
		
		
		
				
		
		

	}

}
