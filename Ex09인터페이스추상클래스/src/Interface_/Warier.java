package Interface_;

public class Warier extends Character implements Denpensible{
   // implements Denpensible의 모든 기능이 요class Warier에 합쳐진다.
   // 상속받은 추상클래스 메서드를 자식class에서 구체화 하며 재정의 가능하다.
   public void attack () {
      System.out.println("전사 공격");
      System.out.println(damage);
   }
   
   
   public void att () {
      System.out.println("전사 공격!");
   }

   
   // 이건 interface Denpensible의 기능중 default void defen3()기능을
   // 이class에서 좀더 다르게,자세히 오버라이딩 하여 구현하거나,
   // 그대로 메서드 기능을 사용하고 싶다면 이미 알아서 Denpensible의 모든기능이 합쳐져 있다. 
   
   // interface Denpensible에서 선언한 default void defen3() 메서드는
   // 여기 class에서 넘어와서 Override 할경우 접근제한자가 public으로 바뀐다.

 
   @Override
	public void defen3() {
		// TODO Auto-generated method stub
		Denpensible.super.defen3();
	}
   
   
   
   
}