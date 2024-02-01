package for문;

import java.util.Scanner;

public class ExFor02 {

	public static void main(String[] args) {
		// for문 활용해서 구구단 2단 출력
		
		for(int i= 1; i <= 9; i++) {
			System.out.println(2 + "*" + i + "=" + (2*i));
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단 입력해 주세요. : ");
     	int num = sc.nextInt();
     	
     	for(int i= 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
		}
		
		
		
		

	}

}
