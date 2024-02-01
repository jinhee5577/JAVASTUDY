
public class Ex00BasicExample {

	public static void main(String[] args) {
		// 메서드 밖에서 메서드 생성해야 한다.
		System.out.println(plus(3, 4));
		System.out.println(minus(5, 3));
		System.out.println(multiple(3, 6));
		System.out.println(devide(6, 2));
		System.out.println(division(-1));
		System.out.println(isyaksoo(4, 1));
		System.out.println(isPerfect(6));
		System.out.println(closer10(11, 7));
		System.out.println(fibonachi2(45));

		// ---- 피보나치 수열------
		int input = 10;
		int[] fibo = new int[10];
		fibo[0] = 0;
		fibo[1] = 1;

		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}

		for (int x : fibo) {
			System.out.println(x + " ");
		}
	}

	public static int plus(int a, int b) {
		// 방법 1
		int result = a + b;
		return result;

	}

	private static int minus(int a, int b) {
		// 방법 2
		return a - b;
	}

	public static int multiple(int a, int b) {
		return a * b;
	}

	public static int devide(int a, int b) {
		return a / b;
	}

	// 양 음 구분 메서드

	public static String division(int a) {
		if (a > 0) {
			return "양수";
		} else if (a < 0) {
			return "음수";
		} else {
			return "0입니다.";
		}
	}

	public static boolean isyaksoo(int a, int b) {
//		if(a % b == 0) {return true;}
//		else {return false;}

		// 방법 2. 비교연산의 결과는 언제나 boolean 이니까 굳이 조건문 안써도 된다.
		return a % b == 0;
	}

	// 완전수 구하기 (자신을 제외한 약수들의 합 == 자신)
	public static boolean isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}

	// 근거리 알고리즘.
	private static int closer10(int a, int b) {
		// a과 10의 거리, b와 10거리 측정한 후 비교.
		// 1. 10이랑 각각의 수를 비교해서 a -10할지 b-10할지 선택.
		// 2. 값을 뺀 뒤에 절대값을 구해서 비교해보기. -> java의 도구중 Math클래스를 이용.
		// 3. 빼고 제곱해버리기.

		int dis_num1 = Math.abs(10 - a);
		int dis_num2 = Math.abs(10 - b);

		return dis_num1 > dis_num2 ? b : a;
	}

	// 피보나치 수열
	// 피보나치 수열의 n번째 합을 계산하여 리턴하는 피보나치 메서드 설계.
	//

	private static int fibonachi(int n) {
		int[] fibo = new int[n];
		fibo[0] = 0;
		fibo[1] = 1;

		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}

		for (int x : fibo) {
			System.out.println(x + " ");
		}

		return fibo[fibo.length -1];
	}
	
	// 쌤풀이
	private static int fibonachi2(int n) {
		if (n==1|| n==2) {
			return 1;
		} else {
			return fibonachi2(n-1) + fibonachi2(n-2);
		}
	}

}
