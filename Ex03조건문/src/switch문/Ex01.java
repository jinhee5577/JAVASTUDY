package switch문;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// main + 컨트롤 + 스페이스 main메소드 생성됨;
		// 월을 입력받아서 해당하는 계절을 출력하는 프로그램 만들기.

		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해주세요~!.: ");
		Random rd = new Random(); // 랜덤한 숫자를 뽑아내준다.
//		rd.nextFloat();
		// int의범수는 21억??까지?? 빅데미말??도 있단다.

		int month = sc.nextInt();
		// 1. if문 이용해서 계절 출력하기.
		// 12,1,2 월 => 겨울
		// 3,4,5 월 => 봄.
		// 6,7,8 => 여름
		// 9,10,11 => 가을.

		String season = null; // null(비어있음.)도 가능. 0이란(데이터)숫자 조차없다. 스트링에서만 쓸수있다. 다른 레퍼런스 타입들 사용가능.
		// int 등 숫자는 null을 가질수 없다. 숫자에서 null을 0으로 인식함.
		// ex) month가 12 or 1 or 2 이면 겨울이다. / 이하 동문

		// else if는 그외조건중 다른조건을 잡아주기 위해. else if씀.
 		if(month == 12 || month == 1 || month == 2){
 		   season = "겨울";	
 		} else if(month == 3 || month == 4 || month == 5) { 
 			season = "봄";	
 		} else if(month == 6 || month == 7 || month == 8) { // else if는 그외조건중 다른조건을 잡아주기 위해. else if씀.
 			season = "여름";	
 		} else if(month == 9 || month == 10 || month == 11) { // else if는 그외조건중 다른조건을 잡아주기 위해. else if씀.
 			season = "가을";	
 		} else {
 			season = "error";
 			System.out.println("입력이 잘못되었습니다.");
 		}

		// 2.switch문을 이용해서 프로그램작성.
// 		switch() {
// 		 case 값중하나:
// 			  실행문;
// 			  break;
// 		 case 값중하나:
// 		 case 값중하나:
// 		 default : 
// 			 실행문장.
// 			 break;
// 		}
// 		// 자동정렬 컨트롤 + 쉬프트 + f
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			season = "잘못된 입력입니다.";
			break;

		}
		if(month > 0 && month < 13) {
		   System.out.println(month + "월은 " + season + "입니다.");
		} else { System.out.println(season);}
		
		
	}

}
