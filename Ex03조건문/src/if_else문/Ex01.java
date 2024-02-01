package if_else문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// int 타입의 score선언 -> 키보드로 값 입력받기
		// 조건 : score가 60보다 크다면 합격
		// 그게 아니고 작다면 불합 을 출력
		// 1.사용자 입력받기.
		
		int scroe;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요. : ");
		scroe = sc.nextInt();
		if(scroe > 60){
		   System.out.println("합격입니다.");	
		} else { System.out.println("불합격입니다."); }
		
			
		// 예제2
		int num1, num2, num3;
		System.out.print("첫째 숫자를 입력해주세요. : ");
		num1 = sc.nextInt();
		System.out.print("둘재 숫자를 입력해주세요. : ");
		num2 = sc.nextInt();
		System.out.print("셋째 숫자를 입력해주세요. : ");
		num3 = sc.nextInt();
		
		int max;
	    if(num1 > num2){
	       max = num1;
	    } else { max = num3; } 
	    if(max < num3) {
	       max = num3;
	    }	    
	    System.out.println("최대값은 : "+ max +"입니다.");
	    
	    
	    
		 
	
		
		
		
		
		
		
		
		

	}

}
