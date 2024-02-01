package Ex01배열;

import java.util.Scanner;

public class Ex01배열 {

	public static void main(String[] args) {
		// 변수 선언.
		int a;
		// 변수 생성.
		a = 10;
		// int a = 10;
		
		// 배열 선언 -> 데이터타입 [] 배열 이름;
		// 주소를 참조해서 레퍼런스 타입니다!!!.
		int[] intArray;
		
		// 배열 생성 -> 배얼이름 = new 데이터타입 [배열크기];
		intArray = new int[5];
		// 기본데이터 타입(크기가 정적이다.)
		// int, long, short, byte, float, double,
		
		// 레퍼런스 타입(new) ->  주소값(크기가 유동적 얼마든지 바뀔수 있다.).
		// Scanner, Random, String....
		Scanner sc = new Scanner(System.in);
	//	Random rd = new Random();
		String name = "남주혁";
		
		System.out.println("a : "+ a);
		System.out.println("intArray : "+ intArray);		
		
		// 배열의 값을 수정또는 삽입.
		intArray[0] = 2;
		intArray[1] = 4;
		intArray[2] = 1;
		intArray[3] = 9;
		intArray[4] = 6;
		
		// 배열의 값에 접근.
//		System.out.println(intArray[0]);
//		System.out.println(intArray[1]);
//		System.out.println(intArray[2]);
//		System.out.println(intArray[3]);
//		System.out.println(intArray[4]);
		
		// 배열의 크기를 알려주는 키워드. -> 배열이름.length
		System.out.println("배열크기 : " + intArray.length);
		// for문사용하여 배열의 값에 접근.
		for(int i=0; i < intArray.length; i++) {
			System.out.println(intArray[i]);			
		}
		
		
		// 배열 선언 및 생성하는 방법.
		// 1). 데이터타입 [] 레퍼런스변수 = new 데이터타입[배열크기];
		// 2). 데이터타입 [] 레퍼런스변수 = {data1, data2, data3};
		//                             [0]    [1]    [2]
		
		String[] team = {"나인혜", "오진희", "임정민", "오종원"};
		for(int i = 0; i < team.length; i++) {
			System.out.print(team[i]+", ");			
		}
		
		int arry[] = {1,2,3,4,5}; // 절대 배열 크기 지정 못함. 그냥 []안에 비워라 앞에 선언할때는.
		int[] arry2 = {1,2,3,4,5}; // 절대 배열 크기 지정 못함. 그냥 []안에 비워라 앞에 선언할때는.
		System.out.println("실험: "+ arry[2]);
		System.out.println("실험: "+ arry2[3]);
		
		

	}

}
