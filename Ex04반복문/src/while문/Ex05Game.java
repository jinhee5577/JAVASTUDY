package while문;
import java.util.Random;
import java.util.Scanner;

public class Ex05Game {

   public static void main(String[] args) {
      // java Game
      Scanner sc = new Scanner(System.in);
      Random rd = new Random();
      int point = 1000;      
      int start = 1;
      int userNum = 0;
      int winCount = 0;
      
      while(point > 0){
         System.out.println("============ UP DOWN GAME ========");
         System.out.print("게임시작은 1이고 게임종료는 0을 입력해주세요.");
         start = sc.nextInt();
         if(start == 0) {
            System.out.println("게임을 종료 합니다.");
            break;
         } else {
            int randomNum = rd.nextInt(99)+1;
            System.out.println(randomNum);
            
            
            while(true) {
               System.out.print("숫자를 입력해주세요.");
               userNum = sc.nextInt();
               point -= 100;
               
               if(randomNum == userNum) { 
                  point += 300;
                  System.out.println("승리 횟수: "+ (++winCount)+ "입니다. 잔여포이트는 : "+ point);
                  break;            
               } else if(userNum < randomNum) { 
                  System.out.println("UP 입니다." + point +"입니다.");
               } else {
                  System.out.println("DOWN 입니다." + point +"입니다."); 
               }
            
               if(point == 0) {
                  System.out.println("승리횟수: " + winCount + "입니다.");
                  break;
               }
               
            }
            
            
            
         }
         
         
         
         
      }
      
      
   
      
      
      

   }

}