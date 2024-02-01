package 대입연산자;

public class Ex00basic {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = num1 + 3; // 13
		int num3 = 7;
		num1 = num3 + 10; // 17
		System.out.println(num2);
		System.out.println(num1);
		
		// 복합대입연산자.
		int num4 = 14;
		num4 += 3;
		// 알트 + 방향키 위아래 하면 줄 원하는곳으로 이동 가능.
		for(int i =0; i < 5; i++) {
		 num4 +=3;
		}
		 num4 *= 3;
		 System.out.println(num4);
		 
		 

	}

}
