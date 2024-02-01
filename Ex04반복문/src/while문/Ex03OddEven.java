package while문;
import java.util.Scanner;

public class Ex03OddEven {

	public static void main(String[] args) {
		// 홀수 짝수 몇개입력 되었는지 출력하기.
		// -1을 입력하면 종료.
		Scanner sc = new Scanner(System.in);
		
		boolean bool2 = true;
		int even = 0;
		int odd = 0;
		String st = null;
		
		while(bool2) {
			System.out.println();
			System.out.println("숫자 입력해주세요. :");
			int num2 = sc.nextInt();
			if(num2 == -1) {
				System.out.println("종료 되었씁니다."); 
				break; 
		    }
			if(num2 % 2 == 0) { even++; st = "짝수";}
			else { odd++; st = "홀수"; }
			System.out.println(st + "개수:" +(num2 % 2 == 0 ? even: odd));
			
		}
		
		
		

	}

}
