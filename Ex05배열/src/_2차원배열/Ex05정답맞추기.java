package _2차원배열;

import java.util.Scanner;

public class Ex05정답맞추기 {

	public static void main(String[] args) {
		//  3행 5열 asnwer 만들고 정답 비교문제.
		
		// 2. 3행 5열 2차원 배열 만들기.		
		// 0번행 -> 답으로 초기화 : 
		// 1번행 -> 입력한 값 : 0,0,0,0,0
		// 2번행 -> 배점으로 초기화: 10,20,30,20,20
		Scanner sc = new Scanner(System.in);
		
	//	int[][] answer = new int[3][5];
		// {} -> 일차원배열.		
		int[][] answer = {{4,5,4,1,2},{0,0,0,0,0},{10,20,30,20,20}};
		
		// 정답데이터 입력받고 이차원배열의 1번행에 차례대로 넣기.
		for(int i =0; i <answer[0].length; i++) {
			System.out.print((i+1)+ "번째 답 :");
			answer[1][i] = sc.nextInt();			
		}
		
		// 정답비교.
		// 0번행 : 답.
		// 1번행 : 입력값.
		// 2번행 : 배점.
		int sum = 0;
		for(int i=0; i <answer[0].length; i++) {
			if(answer[0][i] == answer[1][i]) {
				sum += answer[2][i];
				System.out.print("O" + "\t");
			} else {
				System.out.print("X" + "\t");
			}
		}
		System.out.println();
		System.out.print("총합 : "+ sum +"점");
		
		
		

	}

}
