package abstract_;

public class Warrior extends Character{

   @Override
   public void attack() {
      System.out.println("공격");
   }
   
    // abstract public void hi(); // 여기서 이렇게 사용 불가능.
   // 이건 추상메서드 머리만 선언 한것이므로 이므로 여기서 이렇게 사용 불가능하다.
   // 사용하고 싶으면 추상클래스에서 abstract public void hi(); 이렇게 대략적으로 형태만 선언해주고
   // 상속 받은 자식 클래스에서 메서드를 Override로 구체적으로 재정의 해서 사용해라. 구체화

}