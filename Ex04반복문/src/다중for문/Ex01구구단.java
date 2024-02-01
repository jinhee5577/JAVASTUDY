package 다중for문;

public class Ex01구구단 {

	public static void main(String[] args) {
		// 구구단 몽땅 출력하기.
		// 2단
//		for(int i= 1; i <= 9; i++) {
//			System.out.println(2 + "*" + i + "=" + (2*i));
//		}
//		// 3단
//		for(int i= 1; i <= 9; i++) {
//			System.out.println(3 + "*" + i + "=" + (3*i));
//		}
		
				
		// 구구단 몽땅 출력하기
//		for(int j=2; j <= 9; j++) {
//			System.out.println();
//			System.out.println("==" + j + "단 :");			
//			for(int i= 1; i <= 9; i++) {
//				System.out.println(j + "*" + i + "=" + (j*i)+ " ");
//			}
//		}
//		
		// 2번째 구구단 몽땅 출력하기
		for(int j=2; j <= 9; j++) {
			System.out.println();
			System.out.println("==" + j + "단 :");			
			for(int i= 1; i <= 9; i++) {
				System.out.println(j+ "*"+ i +"="+ (j*i)+" ");
			}
		}
	
		// byte, short, int, long
		// int dan = 2; 
		for(int j=1; j < 10; j++) {//2째 항수 올라감.
			for(int i=2; i < 10; i++) { //1째, 3째 항 수 올라감.
				System.out.print(i+"*"+j+"="+(i*j));
				System.out.print("\t");
			}	
			System.out.println();
		}
		
		
//		for(int j=0; j < 11; j++) {
//			System.out.print((j+2)+"*2="+(j+2)*2);
//			System.out.print("\t");
////			for(int i=1; i <= 9; i++) {				
////				System.out.print(j+"*"+ i+"="+ j);
////				System.out.println("\t");
////			}
//		}
//		System.out.println();
//		for(int j=0; j < 11; j++) {
//			System.out.print((j+2)+"*3="+(j+2)*3);
//			System.out.print("\t");
////			for(int i=1; i <= 9; i++) {				
////				System.out.print(j+"*"+ i+"="+ j);
////				System.out.println("\t");
////			}
//		}
		

	}

}
