package ex_Interface;

public interface Ex01 {
	// 소프트웨어적 인터페이스의 특징. - 규격화.
	// 클래스 필드(속성,변수), 메소드
	
	// 인터페이스도 필드, 메서드로 구성이 되어있습니다.
	// 필드(변수)의 특징.
	// 상수만 가능 final  final static
	public static final int num1= 0;
	// 생략 가능한 부분들이 있다!.
	
	// final 생략가능. -> 상수만 작성 가능하다고 했씁니다!.
	// 클래스에서 접근제한자를 작성하지 않으면 default
	// 인터페이스에서 접근제한자를 작성하지 않으면 public이다.
	// public도 생략 가능. + static도 생략 가능.
	int num2 = 0; // 상수 취급됨.
// 	num2 = 10; // 대입 불가!!. 상수라서 대입 불가!.
	
	
	// 메서드의 특징.
	// 인터페이스 내 메소드는 추상메소드만 가능합니다. // 1.7ver 이후부터 이말은 틀리게됨.
	// 인터페이스 내 abstract 생략 가능.
	// 접근제한자 abstract 리턴타입 메소드명 (매개변수);
	public abstract void test1();
	
	// 메소드도 마찬가지로 생략가능한 키워드들이 있다!.
	// public 생략 가능.
	// abstract 생략 가능.
	void test2();  // <-- 이렇게 써도 가능하다. 추상메서드.
	
	// jdk가 발전하면서 일반메소드도 사용이 가능해졌다!.
	// default 메소드가 등장.
	default void test3() {
		
	}
	
	// 1.9 private 메소드도 등장. static메소드도 등장함.
	private void test4 () {
		
	}
	
	static void test5() {
		
	}
	
	
	
	

}
