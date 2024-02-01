package Ex페스티벌;

import java.util.Scanner;

public class Java페스티벌03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for(int i=0; i<5; i++) {
			System.out.print((i+1) +"번째 수 입력 : ");
			num[i] = sc.nextInt();
		}

		System.out.println("정렬 후");
		//버블정렬
		for(int i=0; i<num.length;i++) {
			for(int j=0; j<i; j++) {
				if(num[i] < num[j]) {
					int temp = num[i] ;
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		
		// 10진수를 2진수로 바꾸기.
//		int anyNum = 12;
//		int jinsoo = 0;
////		int[] jinsoo = new int[]
//		int ind = 0;
//		while(anyNum > 0) {
//			jinsoo[ind] = anyNum % 2;
//			ind++;
//			
//		}
		
		
		
		
		
		

	}

}
