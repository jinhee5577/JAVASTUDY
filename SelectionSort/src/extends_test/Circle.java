package extends_test;

public class Circle extends Shape{
	int age = 5;
	
	// draw 오버라이딩
	public void draw() {
		System.out.println("Circle");
	}
		

	public static void main(String[] args) {
		Shape b = new Circle();
		b.paint();
		b.draw();
		
		
		Shape sp = new Circle();  // 업캐스팅
		sp.draw(); // 동적 바인딩.
		Circle cl = (Circle)sp;  // 다운 캐스팅
		cl.draw(); // 됨.
		
		// 생성된 객체의 본질을 생각해라.
		Circle sub2 = (Circle) new Shape();   // 이건 에러
		// 런타임 과정에서 Shape 부모클래스 객체를 Circle 자식클래스에 담을수 없음!. 을 알게되고 런타임 에러가 나오게 되는것!.
		
		Shape uu = sub2;
// 		System.out.println(uu.age);  Shape로 만든 객체 에는 age가 없음. 그래서 에러남!.
		
		
		
		
	}

}
