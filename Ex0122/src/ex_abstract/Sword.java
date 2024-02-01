package ex_abstract;

public class Sword extends Weapon{

	@Override
	public void stab() {
		System.out.println("검으로 찌르기");
	}

	@Override
	public void attack() {
		System.out.println("검으로 공격하기");
	}
	// 오버라이딩 
	// 조건: 부모클래스에 존재하는 메소드(상속관계)
	// 2. 메소드 이름 같아야한다.
	// 3. 매개변수 갯수, 타입 같아야한다.
	// 4. 리턴타입 같아야한다.

	@Override
	public void stab2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack2() {
		// TODO Auto-generated method stub
		
	}
	
	// 
	
	

}
