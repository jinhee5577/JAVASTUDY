package 비교연산자;

public class Ex00Basic {

	public static void main(String[] args) {
		// 비교연산자의 종류 
		// <,>, <=, >=, == , !=
		// 비교 연산자의 결과는 언제나 참/거짓 (t/f) -> boolean자료형
		
		int num1 =10;
		int num2 =9;
	    System.out.println(num1 > num2);
	    System.out.println(num2 > num1);
	    
	    int num3 = 20;
	    int num4 = 20;
	    System.out.println(num3 == num4);
	    System.out.println(num3 != num4);
	    
	    // 문자열비교. 
	    // 문자열 레퍼런스 타입.
	    String str1 = "1";
	    String str2 = "1";
	    System.out.println(str1 == str2);
	    System.out.println(str1.equals(str2)); // .equals 이방식이 문자열 비교 하는 방식 중요!!! ***
	    
		
		
		
		
	}

}
