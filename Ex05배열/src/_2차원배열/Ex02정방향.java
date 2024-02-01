package _2차원배열;

public class Ex02정방향 {

	public static void main(String[] args) {
		// 정방향으로 출력하기.
		// 1~25 까지의 정수를 5행 5열의 이차원배열에 저장.
		// 5행 5열의 이차원배열 만들기.		
		
		// 0행
		//arr2[0][0] = 1;
		//arr2[0][1] = 2;
		//arr2[0][2] = 3;
		//arr2[0][3] = 4;
		//arr2[0][4] = 5;
		
		// 1행
		//arr2[1][0] = 6;
		//arr2[1][1] = 7;
		//arr2[1][2] = 8;
		//arr2[1][3] = 9;
		//arr2[1][4] = 10;
		int[][] arr2 = new int [5][5];
		int count = 1;
		
		// 입력부.
		for(int j = 0; j < arr2.length; j++) { // j:행 , i:열 
			for(int i = 0; i < arr2[j].length; i++) {
				arr2[j][i] = count++;
			}
		}
		
		// 출력부.
		// 1~25 정수를 입력하는 이중 for문.
		for(int j = 0; j < arr2.length; j++) { // j:행 , i:열 
			for(int i = 0; i < arr2[j].length; i++) {
//				arr2[j][i] = count++;
				System.out.printf("%3d", arr2[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
