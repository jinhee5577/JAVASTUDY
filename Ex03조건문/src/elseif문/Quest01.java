package elseif문;

import java.util.Scanner;

public class Quest01 {

   public static void main(String[] args) {
      // 할인률 문제
       Scanner sc = new Scanner(System.in);
       System.out.print("금액을 입력해주세요.: ");
       int mony = sc.nextInt();
       double rate = 0;
       int dc_mony = 0;
       int discounted_mony = 0;
       
       if(mony >= 100000){
         rate = 0.1;
         dc_mony = (int)(mony * rate); // (실수 값)이므로 앞에 int로 형번환.
         discounted_mony = mony - dc_mony;
         
       } else if(mony >= 50000){ // else if 이게 아니라면 이조건을 실행한다. <- 이렇게 실행한다.
    	   // 그런데 왜 else 없애면 값이 달리지니?? 다 5% 할인률만 출력되네. else입력 하면 원하는 값 도출.
         rate = 0.05;
         dc_mony = (int)(mony * rate); // (실수 값)이므로 앞에 int로 형번환.
         discounted_mony = mony - dc_mony;          
       }
       System.out.println("총금액:"+ mony + "원, 할인율: "+ (int)(rate*100) +"%, "+ "할인 금액:"+ dc_mony +"원, 할인된금액: "+ discounted_mony +"원");
      

      ///  ---------------------------------------------
       
      // 환율 문제.       
       System.out.print("금액을 입력해주세요.: ");
       int mony2 = sc.nextInt();
       System.out.print("국적을 입력해주세요.: ");
       String country = sc.next();
       double exchangeRate = 0;
       double exchanged = 0;
       String unit = "";
       
       switch(country) {
          case "USD":
             exchangeRate = 0.77;
             exchanged = (mony2 * exchangeRate / 1000);
             unit = "달러";
             break;
             
          case "JPY":
             exchangeRate = 102.32;
             exchanged = (mony2 * exchangeRate / 1000);
             unit = "엔";
             break;
             
          case "EUR":
             exchangeRate = 0.70;
             exchanged = (mony2 * exchangeRate / 1000);
             unit = "유로";
             break;
          
          default:
             System.out.println("우리 은행은 그외 국가는 지원하지 않습니다.");
       }
       
       System.out.println("1000원은 "+ exchangeRate + country +"입니다.");
       System.out.println("입력하신 "+ mony2+ "원의 환전된 금액은: " + exchanged + unit +" 입니다.");
       
       
   }

   
}