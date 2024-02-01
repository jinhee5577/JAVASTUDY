package 산술연산자;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Ex01 {

	public static void main(String[] args) {
		// ------------ 2DAY ----------------
		// 변수 num이 943면 900을 출력하는 코드를 작성하세요.
		int num = 942;
		num = (num / 900) * 900;
	//	System.out.println(num);
		
		// 쌤 풀이1 (형변환 이용해서)
		
		int num2 = num / 100;
	//	System.out.println(num2 * 100);
		
		// 쌤 풀이2 (나머지 연산자 이용.) 
		int num3 = 999;
		int num4 = num3 % 100;
	//	System.out.println(num3 - num4);
		
		// 2실습
		// 1. 입력도구 가져오기
		//2. 사용자의 입력받기.
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력: ");
		int number1 = sc.nextInt();
		System.out.println("두번째 정수 입력: ");
		int number2 = sc.nextInt();
		
		// 3. 연산결과 출력하기.
		int plus = number1 + number2;
		int minus = number1 - number2;
		int multiply = number1 * number2;
	    float divide = number1 / number2;
	    int remain = number1 % number2;
	    System.out.println("더하기 결과 : " + (number1 + number2)); // +
	    System.out.println("빼기 결과 : " + (number1 - number2));
	    System.out.println("곱하기 결과 : " + number1 * number2);
	    System.out.println("나누기 결과: " + number1 / number2);
	    System.out.println("나머지 결과 : " + number1 % number2);
		System.out.println("더하기 결과 : " + plus);
		
		// 내정답.
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
		System.out.println(remain);
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
	    LocalTime time2 = LocalTime.now();
	    System.out.println(time2);
	    int hour = time2.getHour();        
	    int minute = time2.getMinute();        
	    int second = time2.getSecond();
	    System.out.println(hour);
	    
	    // 포맷 정의하기        
	  //  DateTimeFormatter formatter = DateTimeFormatter.ofPattern();        
	    
	    // 포맷 적용하기        
	//    String formatedNow = now.format(formatter);

	    
	    
		
		
		
		
	}

}
