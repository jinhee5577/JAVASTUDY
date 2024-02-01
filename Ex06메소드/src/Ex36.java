import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("power"));
		// 입력한 문장에서 알파벳 빈도수.
		// 1. 입력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		String str = sc.nextLine(); // 띄어쓰기 포함되어 문자열 입력.
		String[] strs = str.split("");
		int[] alp = new int[26]; // 각알파벳이 몇번 나왔는지 저장할 배열.
		
		// 입력한 글자가 무엇인지 확인하는 for문
		for(int i =0; i < strs.length; i++) {
			for(char j= 'a'; j<= 'z'; j++) { // 문자형 char 숫자체계라 계산 가능.
				if(strs[i].charAt(0) == j) {
					alp[j - 'a']++; // j - 'a'이러면 인데스 번호가 나옴.
				} else if(strs[i].charAt(0) == j-32){ // 대문자 본다.
					
				}// charAt(몇번째글자) 0을 입력하면, 맨앞글자.
				//"송승호".charAt(0) => "송"			
				//"송승호".charAt(1) => "승"			
				//"송승호".charAt(2) => "호"			
			}
		}
		
		// 알파벳 출력하기
		char alp2 = 'a'; // 초기값
		for(int x: alp) {
			System.out.println(alp2 + " : "+ x);
			alp2++;
			
		}

	}
	
	public static String getMiddle(String inWord) {
		String word="";
		String[] words = inWord.split("");
		if(words.length%2==0) {
			word = words[words.length/2-1]+words[words.length/2];
		}else {
			word = words[words.length/2];
		}
		return word;
	}
	

}
