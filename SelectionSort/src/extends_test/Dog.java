package extends_test;

public class Dog extends Animal{
	   String name = "jinhee555555555";  // 이건 필드 재할당 으로 봐라.
	   String korea;
	   
	   
	   public Dog(String name, String korea) {
	      this.name = name;
	      this.korea = korea;
	   }

	   public void sound() {
	       name = "왜 안되냐고~~~";
	       System.out.println("난 말티쥬개다."+ name);
	   }
	   
	   public void dodo() {
	        System.out.println(" 무지개 색 공가져와");
	     }

	      
	   public void any() {
	        System.out.println("난 말티쥬 라니까.!!!~~~");
	   }
	      
	   	   
	   
	   public static void main(String[] args) {
	      Animal dog = new Dog("jinhee7777", "미국개");
	      dog.sound();  // 동적 바인딩.
	      dog.dodo();  // 동적 바인딩.
//	      dog.any();  // 실행 안됨.
	      
	      // 오버라이딩은 메소드에서만 오버라이딩 한다.
	      System.out.println(dog.name); // 부모클래스 name에 접근됨.
	      // 아!! 생각남!!. 상속받은 자식(파생)클래스 에서는 부모클래스의 모든 내용들을 상속받아 접근 하고 사용할수 있지만,
	      // 반대로 부모(기초)클래스에서 자식(파생)클래스의 내용들 필드,메소드 에는 접근 할수 없다.
	      // 단 자식(파생)클래스에서 오버라이딩한 메소드만 동적 바인딩으로 호출해 줄수 있다. 
	      
	      // 따라서 쌤 말데로,
	      // 더큰 개념일수록 구체적인 접근이 줄어든다. 반대로 구체적일수록 접근할수 있는 기능은 늘어난다.
	      // 피라미드처럼 생각해 그냥...! 구체적인 기능접근은, 다운 캐스팅으로 내려서 접근해야되!.
	      // 늑대(super)가 양(sub)처럼 풀을 먹을 수는 없다. 풀먹는 메서드 -> 양sub클래스 메서드 이므로. 접근 안됨.
	        
	      Dog dg = (Dog)dog; // 다운 캐스팅. 원래 자식 클래스 객체를 자식 타입으로 다운함.
	      System.out.println(dg.korea); // 이제 자식 클래스에 있는 모든 필드, 메소드 접근 가능함.
	      System.out.println(dg.name);
	      dg.sound();
	      dg.dodo();
	      dg.any();
	      
	      
	      
	      
	      
//	      class는 아무것도 안쓰면 접근제한자가 default가 붙어져요! 이건 여러분들이 코드를 작성하고 저장할때 컴파일이 되면 붙게되는건데
//	      class는 default가, 인터페이스는 public static final이 붙는거에용
//	      인터페이스에서 메소드는
//	      public abstract가 붙게되구용
//	      class 접근제한자 생략시 default
//
//	      interface 접근제한자 생략시 변수 => public static final
//	      접근제한자 생략시 메소드 => public abstract
//
//	      이렇게 정리해 볼 수 있겟네여
//	      인터페이스 메소드 접근자 와 함수 몸통 생략시.  Public abstract 가붙고 따라서 요함수 메소드는 추상메소드가 되는거죠
	      
//	      인터페이스 필드 는 static final이 붙어  상수취급되고  맨상단 stasic영역으로  올라간다는것.
	      
      
	      
//	       쉽게 생각하면 정적바인딩 - 오버로딩
//	       동적바인딩 - 어버라이딩
//	       그 동적바인딩은 나중에 어떤 클래스 타입에 담긴 객체가 가리키는 객체에 따라 메서드가 
//	       실행중에 자동 결정 되는게 동적 바인딩  이용 ㅎㅎ
//	       업캐스팅한 클래스는 원래 있던 서브클래스 메서드는 실행이 안되는걸로 알고 있슴다

	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      


	   }
	}