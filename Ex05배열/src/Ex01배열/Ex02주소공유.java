package Ex01배열;

public class Ex02주소공유 {

	public static void main(String[] args) {
		// 배열 => 레퍼런스 변수 -> 주소값을 가지고 있음.
		// 주소를 공유 가능. 같은 주소를 가리킬수 있음. -> 배열을 공유 가능.
		int[] intAray = new int[5];
		int[] myArray = intAray;
		
		System.out.println("intAray 주소 :" + intAray);
		System.out.println("myArray 주소 :" + myArray);
		
		intAray[1] = 5;
		myArray[3] = 7;
		
		for(int i =0; i < intAray.length; i++) {
			System.out.println(intAray[i]);
		}
		
		
		// 실습 문제1
		String[] arrStr = new String[10];
		arrStr[0] = "JAVA";
		arrStr[1] = "HTML";
		arrStr[2] = "DB";
		arrStr[3] = "PYTHON";
		arrStr[4] = "CSS";
		for(int i = 0; i < arrStr.length; i++) {
			System.out.print(arrStr[i]+ ", ");			
		}
		System.out.println();
		
		// 실습 문제 2
		int[] arr = {1,2,7,6,45,8,92,33,11,65};
		int cnt = 0;
		for(int i =0; i <arr.length; i++) {
			if(arr[i] % 2 != 0) {
		       cnt++;
			}
		}
		
		System.out.println("홀수 갯수: "+cnt);
		
		
		// 실습문제3
		int max = 0;
		for(int i =0; i <arr.length; i++) {
			if(i == arr.length -1) { break;}
			if(arr[i] > arr[i+1]) {max = arr[i];}
			else {max = arr[i+1]; }
		}
		System.out.println("최대값 :" + max);
		
		
		// 실습문제4
		int sum = 0;
		for(int i =0; i <arr.length; i++) {
			sum += arr[i];
		}
		
		float avg = sum / arr.length;
		System.out.println("총합계 : " + sum+ ", 평균 : "+ avg);
		
		
		// 실습문제 5
		String[] score = {"A", "A","B","C","D","A","D","D","D","F"};
		int[] check_count = new int[5];
		
		for(int i=0; i< score.length; i++) {
			if(score[i] == "A"){
				check_count[0]++;
			}else if(score[i] == "B"){
				check_count[1]++;
			}else if(score[i] == "C"){
				check_count[2]++;
			}else if(score[i] == "D"){
				check_count[3]++;
			}else if(score[i] == "F"){
				check_count[4]++;
			}
		}
		
		for(int i =0; i< check_count.length; i++){
			if(i == 0){
			   System.out.println("A학점: " + check_count[0]+ "명");
			}
			if(i == 1){
				System.out.println("B학점: " + check_count[1]+ "명");
			}
			if(i == 2){
				System.out.println("C학점: " + check_count[2]+ "명");
			}
			if(i == 3){
				System.out.println("D학점: " + check_count[3]+ "명");
			}
			if(i == 4){
				System.out.println("F학점: " + check_count[4]+ "명");
			}
		}
		
		
	}

}
