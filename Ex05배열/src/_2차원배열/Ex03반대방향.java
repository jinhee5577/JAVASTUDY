package _2차원배열;

public class Ex03반대방향 {

	public static void main(String[] args) {
		// 반대 방향으로 출력하기.
		
		// 입력부.
		int[][] arr2 = new int [5][5];
		int count = 1;
		
		for(int j = 0; j < arr2.length; j++) { // j:행 , i:열 
			for(int i = 0; i < arr2[j].length; i++) {
				arr2[j][i] = count++;
			}
		}
		// 출력부. 반대방향으로 출력.
		// 1~25 정수를 입력하는 이중 for문.
		for (int j = 0; j < arr2.length; j++) { // j:행 , i:열
			for (int i = 4; i >= 0; i--) {
//						arr2[j][i] = count++;
				System.out.printf("%3d", arr2[i][j]);
			}
			System.out.println();
		}
		
		
		
		// 0행부터 출력.
//		System.out.print(arr2[0][4]+ "\t");
//		System.out.print(arr2[0][3]+ "\t");
//		System.out.print(arr2[0][2]+ "\t");
//		System.out.print(arr2[0][1]+ "\t");
//		System.out.print(arr2[0][0]+ "\t");
//		System.out.println();
//		
//		// 1행부터 출력.
//		System.out.print(arr2[1][4]+ "\t");
//		System.out.print(arr2[1][3]+ "\t");
//		System.out.print(arr2[1][2]+ "\t");
//		System.out.print(arr2[1][1]+ "\t");
//		System.out.print(arr2[1][0]+ "\t");
//		
		
		
		
		
		

	}

}
