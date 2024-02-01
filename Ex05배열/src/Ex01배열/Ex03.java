package Ex01배열;

public class Ex03 {

	public static void main(String[] args) {
		// 1. 배열 만들기
		int[] array = new int [5];
		int[] array2 = {13,5,5,10,20,1}; // 배열 크기 미리 만들 필요 없음.
 		
		// 2.배열에 데이터 넣기.
		array[0] = 13;
		array[1] = 5;
		array[2] = 46;
		array[3] = 75;
		array[4] = 22;
		
		// 3.배열에서 데이터 꺼내기.
//		System.out.println(array[0]);
//		
//		int number = array[0];
//		System.out.println(number);
		
		int[] arr3 = new int[100];
		int mul = 2;
		// index가  0부터 99까지 돈다.
		for(int i= 0; i < arr3.length; i++){ 
			arr3[i] = mul;
			mul *= 2;
		}
		
		// arr3원소 출력.
		for(int i= 0; i < arr3.length; i++){
			System.out.println(i+"번째 공간 : "+arr3[i]);
		}
		
		// for-each문: 확장 for문 -> 배열에 있는 모든 값을 꺼내는것.
		for(int x : arr3) { // 배열의 모든 값 접근. index값 꺼낼수 없다.
			System.out.println(x);
		}
		
		
		

	}

}
