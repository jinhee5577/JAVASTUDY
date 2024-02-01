package elseif문;
import java.util.Scanner;

public class TestEquals {

	public static void main(String[] args) {
		String str1 = "오진희";
		String str2 = "오";
		String str3 = "진희";
		String str4 = str2 + str3;
		
		System.out.println(str1);
		System.out.println(str2 + str3);
		System.out.println(str1 == str4); // 둘이 서로 다르다.
		System.out.println(str1.equals(str4)); // 이게 옳다.
		// 문자열 비교는 .equals()로 비교한다.
		
		
		// 정수 2개와 연산자를 입력 받아서 계산하는 계산기 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);  // 건전지 :System.in
		
		//1. 숫자 두개 입력받고, 연산자 1개 입력받기.
		System.out.print("첫째수 입력하세요. :");
		int num1 = sc.nextInt();
		System.out.print("둘째수 입력해주세요. :");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력하세요. :");
		String oprat = sc.next();
	// 	int result;
		
		
		System.out.print(num1 + oprat + num2+ "=");
		if(oprat.equals("+")){
//			System.out.println(num1 + num2);
			System.out.println(num1 + oprat + num2+ "=" + (num1 + num2));
		}
		if(oprat.equals("-")){
//			System.out.println(num1 - num2);
			System.out.println(num1 + oprat + num2+ "=" + (num1 - num2));
		}
		if(oprat.equals("*")){
//			System.out.println(num1 * num2);
			System.out.println(num1 + oprat + num2+ "=" + (num1 * num2));
		}
		if(oprat.equals("/")){
//			result = (double)num1 / num2;
//			System.out.println((double)num1 / num2);
			System.out.println(num1 + oprat + num2+ "=" + ((double)num1) / num2);
			// num1 / ((double)num2) 이부분에서  int /int 계산은 int가 나오므로 
			// 실수 / int 계산은 실수가 나옴. 따라서 num1 / ((double)num2),  ((double)num1) / num2 = 실수
			// 하지만 (double)(num1 / num2) 하지만 이거는 => int /int 먼저 실행이므로 int가 나옴. 
			// 그뒤에 (double)로 형변환 이므로 정수뒤에 .0을 붙혀서 소수점 단위로 만들어줌.
			
			
		}else {
			System.out.println("잘못된 입력입니다. ");
		}
		
		

	}

}
