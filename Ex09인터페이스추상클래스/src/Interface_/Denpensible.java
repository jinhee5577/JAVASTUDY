package Interface_;

public interface Denpensible  { // 인터페이스,  인터페이스는 실체가 없다구 보세요!
   // 필드 매서드 등 다양한 접근 제한자 모두 쓸수 있음.
   
   
   // 메서드는 크게 정적메서드. 디폴트메서드, 다생략한 경우 만들어지는 추상메서드가 있다.
   // 접근제한자 다 작성가능한데 만약 다생략할때 Public abstract가 생략 되어있는 거다.
   // 1. 정적메서드 -> 객체를 생성하지 않아도 사용할수 있는 메서드. static멤버들
   static void defen2 () {
      System.out.println("ads");
   }
   
   
   // 2. 디폴트메서드
   // 디폴트 메서드 이용해서 기본적인 기능을 정의해볼 수 있고,
   default void defen3() { // default  인터페이스의 기본 메서드
      System.out.println("방어하기");
   }
   
   
   // public void defen(); //추상메서드    이앞에 abstract 안써줘도 되나?? 생략된건가? 그냥 몸통 안써주는게 추상클래스 인가??
   // 기본적으로 추상클래스에서 추상메서드를 선언 가능한데
   // 인터페이스 형태도 잘보면 객체를 만들기위해 존재하는게 아니라 어찌보면 되게 추상적인 개념이에영.
   // 인터페이스는 기능추가용? 이라보면 편할거다.
   // 인터페이스는 실체가 없다구 보세요!.
   // 따라서 실체가 없는 추상적인 개념이라 인터페이스 내에서도 추상메서드를 선언 가능하다.
   // 다 생략하면 추상메서드!. <-- ??
   // void defen(); 접근 제한자, 함수 몸통 생략하면 public abstract가 붙고 따라서 요메서드는 추상 메서드가 된다.
   
   // class는 아무것도 안쓰면 접근제한자가 default가 붙어져요!.
   // 이건 코드를 작성하고 저장할때 컴파일이 되면 붙게 되는건데 class는 default가,
   // 인터페이스는 public static final이 붙는거에요.
   // 인터페이스에서 메소드는 public abstract가 붙게 된다.
   
   // class접근 제한자 생략시 default
   // interface 접근제한자 생략시 변수 => public static final
   // 접근 제한자 생략시 메소드 => public abstract  이렇게 정리 해볼수 있음.
  
   
   
   
   

}