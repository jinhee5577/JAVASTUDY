package ex_Interface;

public interface SmartPhone_Interface extends Phone_Interface, Test_Interface { // 인터페이스간 상속
	// Phone_Interface에서 갖고 있는 메소드 물려받아 보겠다!.
	// 인터페이스간 상속은 다중상속을 지원 합니다!.
	// 클래스간은 다중 상속 지원 안합니다.
	
	// 추상메서드 1개 추가.
	// 다생략하면 추상메서드야 기억해라!!. 아래처럼.
	void internet();
	

}
