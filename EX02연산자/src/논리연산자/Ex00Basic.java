package 논리연산자;

import java.util.Scanner;

public class Ex00Basic {

	public static void main(String[] args) {
		// 논리연산자의 결과값은 언제나 t/f -> boolean타입
		// 종류: !, ||, &&, ^\
		// !(not의 의미를 가짐.) : 앞선 값의 반대되는 값을 나태내고 싶을때 사용.
		boolean check = true;
		System.out.println(!check);
		
		// &&,(and의 의미) 곱연산을 의미함. (그리고의 뜻)
		System.out.println(10 > 3 && 5 >2); // true
		System.out.println(10 > 3 && 5 < 2); // false
		
		// (OR의 의미) 합연산을 의미 (~또는, ~)
		System.out.println(10 > 3 || 5 > 2); // true
		System.out.println(10 > 3 || 5 < 2); // true 노란색 밑줄 deadcode (사용되지 않는 죽는 코드다.) 논리적으로 쓸일이없다.
		System.out.println(10 < 3 || 5 < 2); // false
		
		// 노란줄 -> deadcode (사용되지 않는 죽는 코드다.)
		
		// ^ (XOR의 의미) 두개가 서로 다를때 true.
		System.out.println(10 < 3 ^ 5 > 2); // (f / t) -> true.
		
		// 비트 논리연산자
		// 종류 : ~, |, &, ^
		// 비트논리연산 : 각 비트를 비교하는 연산자.
		
		// ~(not의 의미) 모든 비트를 역으로 돌린다.
		int num1 = 0; // 00000000 00000000 00000000 00000000 4바이트 32bit
		int num2 = 10; // 00000000 00000000 00000000 00001010 4바이트 32bit
		System.out.println(~num2); // 많이사용안됨. java는 2의 보수형태로 음수를 표현한다.
		// 11111111 11111111 11111111 11110101 -> -11
		
		// || (OR의 의미) 모든비트를 OR한다.
		
		// 연산자 하나씩 있을겨우 숫자의 비트를 비교한다.
		// A = 10 / B = 12 이거를 이진수로 표현한다.
		// A = 1010 / B = 1100  <- A는 예로들면 불켜지고, 꺼지고, 켜지고 꺼지고
		int a = 10;
		int b = 12;
		System.out.println(a|b); // 각비트를 or : 결과는 14
		
		// &(and의 의미) 모든 비트를 and한다.
		// A = 1010 / B = 1100
		// 결과  => 1000 (8)
	    System.out.println(a&b);
	    
	    // ^(XOR)
	    // 서로 다르면 1 (TURE)이기때문에
	    // A = 1010 / B = 1100
	    // 결과  => 0110 -> 6	    
		System.out.println(a^b);
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String any = age < 35 ? (age<20 ? "청소년" : "청년") : "중장년";
		System.out.println(any);
		
		
		
		
		
	}

}
