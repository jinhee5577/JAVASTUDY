package elseif문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 할인률 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("지불 금액을 입력해주세요.: ");
		int totalPrice = sc.nextInt();
		int discount = 0;
		

		// 만약 지불금액이 10만원 이상이면 할인율 10%
		// 지불금액이 5만원 이상이면 할인율 5% 이다.

		if (totalPrice >= 100000) {
			discount = 10;

		} else if (totalPrice >= 50000) { // 그런데 왜 else 없애면 값이 달리지니?? 다 5% 할인률만 출력되네. else입력 하면 원하는 값 도출.
			discount = 5;
		}
		
		int dis = (totalPrice*discount / 100);
		int discountPrice = totalPrice - dis;
		System.out.println("총금액:"+ totalPrice + "원, 할인율: "+discount+"%, "+ 
					"할인 금액:"+ dis +"원, 할인된금액: "+ discountPrice +"원");
		

	}

}
