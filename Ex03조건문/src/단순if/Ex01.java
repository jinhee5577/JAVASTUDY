package 단순if;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// int타입의 age를 선언하고, 
		// 키보드로 값을 입력받아서 age가 20보다 크거나 같다면
		// "성인입니다."를 출력하는 프로그램 만들기.
		
		// 단순 if문 형태
		// if(조건식){ 실행문장; }
		// 1.age입력받기
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age >= 20){
		   System.out.println("성인입니다.");	
		}
		
		String word = "아동 입니다.";
		if (age >= 20){
			word = "성인입니다.";		    		    
		}
		System.out.println(word);
		
		
		
	}

}
