package 산술연산자;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Ex00basic {

	public static void main(String[] args) {
		// 1.산술연산자 (+,-,*,/,%<<,>>)
		
		int num1 = 14;
		int num2 = 10;
		
		System.out.println(num1 + num2); // 알트 + 쉬프트+ a 한번에 변경하기.
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		// /슬래시가 몫을 구하는 연산자인데, 정수에 한해서만 몫을 구함.
		// 실수 끼리 만약 연산을 하면 소수점까지 결과가 나온다.
		
		// 실수끼리 연산하기
		float num3 = 14.0f;
		float num4 = 10.0f;
		System.out.println(num3 / num4);
		System.out.println(num3 % num4);
		
		// 정수 연산 정수
		System.out.println(num1 / num2); //정수
		//정수 연산 실수
		System.out.println(num3 / num4); //실수
		// 실수 연산 실수
		System.out.println(num3 / num4); // 실수
		
		// 실수 연산 정수를 하면 자동으로 실수 연산이 된다. (묵시적 형변환)
		byte age = 10;
		System.out.println("내나이는 " + (age+50) + "살 입니다.");
		// 문자 연산 정수  => 문자가 나온다.
		
		String s_num1 = "1";
		int num5 = 1;
		
		// 문제 
		System.out.println();
		System.out.println(1+2+"3"); // 33
		System.out.println("1"+2+3); // 123 나열만.
		System.out.println(1+"2"+3); // 123
		System.out.println("1"+(2+3)); //15\
		
		// 비트 연산자.
		// 10을 2진수로 표현하면 = 1010
		// << 1010 -> 10100 (20) -> *2와 동일
        // >> 1010 -> 101 (5) -> /2 와 동일
		int bit_num = 10;
		int result;
		result = bit_num << 1; // 왼쪽으로 한칸 이동해주세요.
		System.out.println(result);
		result = bit_num >> 1;// 오른쪽으로 한칸 이동해주세요.
		System.out.println(result);
		
		
	}
}
		

