package 증감연산자;

public class Ex00Basic {

	public static void main(String[] args) {
		// 증감연산자
		// 1만 증가시키거나 1만 감소시키는 연산자.
		// 종류: ++, --
		// 사용방법: ++num, num++;
		// ++num : 1증가하고 이전의 값을 저장한다던지 출력한다던지.
		// num++ : 먼저 출력, 저장하고 1증가 시킴.
		
		int a = 10;
		System.out.println(a++); // 10
		System.out.println(a); // 11
		System.out.println(++a); // 12
		System.out.println(a); // 12

		a++;
		System.out.println(a);
	}

}
