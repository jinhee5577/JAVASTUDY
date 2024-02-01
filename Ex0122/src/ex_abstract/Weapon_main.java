package ex_abstract;

public class Weapon_main {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.attack();
		s.stab();
		
		System.out.println("=========================");
		
		Spear sp = new Spear();
		sp.attack();
		sp.stab();
		
		
		// 추상클래스의 특징:
		// 추상클래스는 객체를 생성할수 없다.
		// 설계와 구현 파트를 분리 시키는 역할. 추상클래스 만들일 별로 없음.
		// Weapon w = new Weapon();
		
		
		

	}

}
