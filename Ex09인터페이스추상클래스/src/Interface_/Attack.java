package Interface_;

public interface Attack { // 인터페이스,  인터페이스는 실체가 없다구 보세요!
   int demage = 100; // 상수 취급됨. static final취급됨. 변경불가!!. (반드시 초기값 대입)
   // Interface내에 필드선언시 final static이 붙어 취급된다고 생각하면 됨.!
   // 필드가 final static이에용!
   // 필드만 상수 취급 되어 절대 변경 불가능 임.
 
   
   
   // 메서드도 static영역으로 올라간다.
   // 메서드는 나중에 다른class에 interface로 기능만 넣어줄때 그class에서 
   // 메서드를 오버라이딩으로 재정의 가능하다.
   default void att () {
      System.out.println("전사 공격!");
   }
   
   
   
   
}
   