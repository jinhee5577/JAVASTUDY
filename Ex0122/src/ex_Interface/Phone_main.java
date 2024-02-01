package ex_Interface;

public class Phone_main {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.receive();
		sp.internet();
		sp.sendMessage();
		
		// 인터페이스는 추상클래스와 마찬가지로 객체 생성을 할수 없습니다!.
		// 업캐스팅, 다운캐스팅
		// Interface가 추상적이라 더큰 개념임. 더큰 감싸는 껍데기??.
		// 더큰 개념일수록 구체적인 접근이 줄어든다. 반대로 구체적일수록 접근할수 있는 기능은 늘어난다.
		// 피라미드처럼 생각해 그냥...! 구체적인 기능접근은, 다운 캐스팅으로 내려서 접근해야되!.
		
		// 예제코드
		SmartPhone_Interface spi = new SmartPhone(); // 업캐스팅 <- 분류크게 만들어서 관리쉽게하기위해서 범위가 넓을수록.
		// 이코드는 spi에서 SmartPhone객체 메서드 접근 안됨.
		
		SmartPhone any = (SmartPhone)spi;  // SmartPhone클래스로 다운캐스팅 시킨거임. 
	 // any. <- 이제 이렇게 접급하면 SmartPhone객체 메서드 사용가능.
		
		
		

	}

}
