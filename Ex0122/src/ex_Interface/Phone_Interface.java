package ex_Interface;

public interface Phone_Interface {
	
	// 2개의 추상메서드와 1개의 default 메소드 구현.
	void call();  // 추상메서드
	void receive(); // 추상메서드
	
	// 추상메소드가 아니다!. {}가 없어서.
	default void sendMessage() {
		
	}
	

}
