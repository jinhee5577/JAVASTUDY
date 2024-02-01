package _2차원배열;

import java.util.Scanner;

public class NNarray {

	public static void main(String[] args) {
		// 정수 n을 입력받아 n*n배열.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int cnt = 1;
		
		for(int i =0; i < n; i++) {
			for(int j =0; j < n; j++) {
				array[i][j] = cnt++;				
			}
		}

		
		
		for(int i =0; i < n; i++) {
			for(int j =0; j < n; j++) {
				array[i][j] = cnt++;	
//				System.out.print(array[j][i]+ "\t");
				System.out.printf("%3d", array[i][j]);							
			}
			System.out.println();
		}
		
	
		//-----------------------------------------
						

	}

}
