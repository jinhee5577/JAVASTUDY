package Ex01배열;

import java.util.Random;
import java.util.Scanner;

public class Ex04_3배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[5];
//		for (int i=0; i< arr.length; i++) {
//			System.out.print((i+1)+"번째 정수 입력해주세요 >>");
//			int num =sc.nextInt();
//			arr[i] = num;
//			
//		}
//		
//		System.out.print("3의 배수 : ");
//		
//		for(int x: arr) {
//			if(x % 3 == 0) {
//			  System.out.print(x +" ");			 
//			}			
//		}
		
		
		
		//-------------------------------------------
		
		// 10칸짜리 배열에 랜덤수를 넣고,
		// 해당하는 수의 총합과 평균을 구하기. /최대값/ 최소값 구하기. / 홀수 갯수/ 짝수 갯수 구하기
		
		//1.10칸 짜리 배열만들기.
		int[] array = new int[10];
		Random rd = new Random(); // 컨트롤 + 쉬프트 + o는 자동 임폴트.
		
		// 2 데이터 셋팅하기. (리소스 구성.)
		// 0~9번 인텍스를 하나하나 일일이 한칸씩 셋팅하기.
		for(int i = 0; i <array.length; i++) {
			array[i] = rd.nextInt(20); //0 부터 20까지 숫자 랜덤한 숫자나옴.
			
			// 중복제거.
			//검사용 for문 만들기(j)
			// 1. j범주를 결정.
			// 2. j번재 숫자랑 i번째 숫자를 비교해준다.
			// 3. 막약에 두개의 숫자가 같다면? i를 강제로 -1 한바뀌 바꾸 시킨다.
			for(int j = 0; j < i; j++) { // 중복 제거 검사 for문. i 까지 검사. 
				if(array[i]== array[j]) {
					i--; // i를 뒤로 빽한다.
					break;
				}
			}
		}
		
	   //3 .데이터 확인하기.
		for(int x: array) {
			// 임시 변수 x.
			System.out.println(x+" ");
		}

		
		// 총합과 평균을 구하기. /최대값/ 최소값 구하기. / 홀수 갯수/ 짝수 갯수 구하기.
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i <array.length; i++) {
			sum += array[i]; // 누적합.			
		}
		System.out.println("총합 : "+ sum);
		avg = (double)sum / array.length;
		System.out.println("평균 : "+ avg);
		
		int max = array[0];
		int min = array[0]; 
		for(int i =0; i < array.length; i++) {
			if(max < array[i]) { max = array[i]; } // 지금 현재의 최대값과 배열에 있는값 비교
			if(min > array[i]) { min = array[i]; } // 지금 현재의 최소값과 배열에 있는값 비교
		}
		
		System.out.println(min + ": " + max);
		
		

	}

}
