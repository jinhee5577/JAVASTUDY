package dataType;

import java.util.Scanner;

public class Ex00Basic {

	public static void main(String[] args) {
		// datatype (Primitive(기본) / Refernce(참조))
		// boolen타입 <-- 논리형 타입. 크기: 1bit 표현범위 : 참/거짓 (true/ false) 
		boolean checkIn = true;
		boolean checkIn2 = false;
	//	boolean checkIn = 324; -> 불가.
		
		// char타입 문자형 타입.
		// 크기 : 2byte: 0~65535
		// java에서 char는 UNICODE와 대응한다.
		// C언어 등에서는 1바이트 를 사용
		// Ascii코드는 8bit체계로 만들어짐.
		// =>  이중 1bit는 parity codefh 1의 갯수가 홀수인지 짝주인지 알려줌. (오류검증용)
		// 그결과 0~127 까지만 표현이 가능했음.
		// 이를 8bit 까지 쓰게 할려다보니 ANSI체계로 256개의 문자와 대응하게 만들었는데,
		// 한글이나, 한자등을 표현하기 어려워저 UNICODE가 생김.
		// ASCII(7bit) => ANSI(8bit) -> UVICODE(16bit)
		
		char name = '오';
		
		// String type
		// char타입은 한글자라는 한계가 있음.
		// 그래서 String이라는 Reference타입을 미리 만들어둠.
		String name2= "오진희"; // 레퍼런스 타입 의 문자열 타입은 색이 안변함.
		
		// byte type
		// 정수형
		// 크기 : 1byte 표현범위 : 2^8 => -128 ~ 127
		// 날짜, 나이
		byte day = 29;
		byte age = 100;
		
		// short 타입
		// 정수형 크기 : 2byte
		// 표현범위 : -32768 ~ 32767
		// 년도
		short year = 2024;
		// int 타입 정수형 크기 : 4byte 표현범위 : 약 -21억 ~ 21억
		// 한국인수
		int koreanHuman = 500000000;
		
		// long 타입
		// 정수형 크기: 8byte, 표현범위 : -920경 ~ 920경
		// 숫자가 너무커서 int를 사용하는 추세.
		long world_Human = 7000000000000l;
		
		// float 타입 실수형
		// 크기 : 4byte
		// 특징 -> 부동소수점방식을 사용함. (bit를 지수부와 가수부로 나누어져서 사용하여 범위가 엄청큼.)
		// float도 알파벡을 뒤에 붙여야한다.
		float pi = 3.14f; //F
		
		// double 타입 실수형 
		// 크기 :  8byte 표현범위 : -1.7e308 ~ 1.7e308
		// float이든 double이든 미세한 오차가 발생할수 있음. => 물리적오차.
		// 항상 값에 소수점을 표기해줘야함.
		
		double num = 1.456789;
		
		// 데이터 타입들은 어느정도 서로 타입을 변환 할수있음.
		// 묵시적형변환(자동형변환) / 강제형변환(명시적형변환)
		// 묵시적 형변환 
		// 등호를 기준으로 타입이 일치하지 않을때 이때 자바의 컴파일러가 
		// 알아서 작은타입을 큰타입으로 자동 형변환을 시켜줌.
		double tenpi = 3.14 * 10; // 3.14 곱하기 10에서 10이 실수연산을 위해 10.0이 된다.
		int num1 = 10;
		double num2 = 20.0;
		num2 = num1; // num2로 num1이 들어가기 위해 10이 10.0이됨.
		// 출력하기.
		System.out.print(num2);
		System.out.println(); // syso +컨트롤 + 스페이스 = 자동완성
		// 실행 컨트롤 + f11
		
		// 명시적 형변환(강제형변환 <casting>)
		// 소괄호를 이용해 타입을 명시하여 강제로 변환함.
		double pie = 3.14;
		int i_pie = (int)pie;
		System.out.println(i_pie); // 컨트롤 + 스페이스 자동완성 변수
		
		// Scanner (입력을 하기위한 도구)
		// System.in.read를 사용하면 출력을 ASCII코드에 맞춰 바꿔줘야 했음.
		// 편하게 입혁하기 위해 Scanner라는 도구를 사용할거다.
		// JRE에 포함된 라이브러리중 하나 이다.
       	Scanner sc = new Scanner(System.in); // 도구 준비
        String name3 = sc.next();
       	System.out.println("입력끝");
       	System.out.println(name3);
       	System.err.println("메렁");
       	
       	// 숫자를 두개 입력받아서 더하는 코드 작성
       	System.out.print("첫번째 정수를 입력해주세요 : ");
       	int num3 = sc.nextInt(); // 숫자만 입력해라
       	System.out.print("두번째 정수를 입력해주세요 : ");
       	int num4 = sc.nextInt(); // 숫자만 입력해라.
       	// 1. 바로 출력하기
        System.out.println(num3 + num4);
        
        //2. 변수에 한번 다시 담아서 출력하기.
        int num5 = num3 + num4;
        System.out.println(num5);
        
        
        //---------------- 2DAY ----------------
        
  
        
        
        
        
        
        
        
        
        
	}

}
