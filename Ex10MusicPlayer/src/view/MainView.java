package view;

import java.util.Scanner;

import controller.MainController;

public class MainView {

	public static void main(String[] args) {
		// view의 역활 : 사용자의 인터페이스(UI)
		// 기능을 사용자가 선택할수 있도록 만들기.
		// 재생, 정지, 다음곡, 이전곡, 종료, 검색
		
		Scanner sc =new Scanner(System.in);
		MainController c = new MainController();
		
		int sel; //사용자 선택
		while(true) {
			System.out.print("[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5]음악찾기 [6]종료 >> ");
			sel = sc.nextInt();
			
			switch(sel) {
				case 1:
					c.play();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default :
					break;
			
			}
			
		}
		
		
		
		
		

	}

}
