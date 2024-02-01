package ex_Interface;

public class SmartPhone implements SmartPhone_Interface, Camera_Interface {

	// 인터페이스는 다중구현이 가능합니다!.
	// 위를 보면 난 2개의 인터페이스를 지금 구현한다. 그러므로 난 다중구현이야. 
	// 추상클래스는 다중 상속은 안된다. 클래스 이기때문에.
	
	@Override
	public void call() {
		System.out.println("스마파트폰 전화 걸기");
		
	}

	@Override
	public void receive() {
		System.out.println("스마트폰 전화 받기");
		
	}

	@Override
	public void internet() {
		System.out.println("스마트폰 인터넷 하기.");
	}

	@Override
	public void pick() {
		System.out.println("스마트폰 사진찍기.");
		
	}

	@Override
	public void testMeshod() {
		// TODO Auto-generated method stub
		
	}

}
