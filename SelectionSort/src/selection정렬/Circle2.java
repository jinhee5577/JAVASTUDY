package selection정렬;

public class Circle2 extends Shape {
	// 오버라이드
	public void draw() {
		System.out.println("Circle");
	}

	public void any() {
		System.out.println("다른 기능");

	}

	public static void main(String[] args) {
		Shape b = new Circle2();
		b.paint(); // 여기는 자식 클래스 에 있는 메서드에 접근 되서 실행됨.
		//  b.any(); // 이건 사용이 안되.
	
	}

}
