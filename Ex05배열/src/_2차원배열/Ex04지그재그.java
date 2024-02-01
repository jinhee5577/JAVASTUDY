package _2차원배열;

public class Ex04지그재그 {

	public static void main(String[] args) {
		// 지그 재그 방향으로 출력하기.

		// 입력부.
		int[][] arr2 = new int[5][5];
		int count = 1;

		for (int j = 0; j < arr2.length; j++) { // j:행 , i:열
			for (int i = 0; i < arr2[j].length; i++) {
				arr2[j][i] = count++;
			}
		}
		// 출력부. 지그 재그 방향으로 출력하기.
		// 1~25 정수를 입력하는 이중 for문.
		for (int j = 0; j < arr2.length; j++) { // j:행 , i:열
			if (j % 2 == 0 || j == 0) { //짝수 방향 순방향.
				for (int i = 0; i < arr2[j].length; i++) {
					System.out.printf("%5d", arr2[j][i]);
				}
				System.out.println();
			} else { // 홀수 방향 역방향.
				for (int i = 4; i >= 0; i--) {
					System.out.printf("%5d", arr2[j][i]);
				}
				System.out.println();
			}
		}
		System.out.println();
		
		
		// 인혜씨 코드.
		for (int j = 0; j < arr2.length; j++) {
	         if (j % 2 == 0 || j == 0) {
	            for (int i = 0; i < arr2.length; i++) {
	               System.out.print(arr2[j][i] + "\t");
	            }
	            System.out.println();
	         } else {
	            for (int i = 0; i < arr2.length; i++) {
	               System.out.print(arr2[j][4 - i] + "\t");               
	            }
	            System.out.println();
	         }
	    }

}
}