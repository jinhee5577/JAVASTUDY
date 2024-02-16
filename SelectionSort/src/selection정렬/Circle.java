package selection정렬;

public class Circle extends Sape {
	String name;
	int age = 5;

	public void draw() {
		age = 52;
		System.out.println("서클");
	}

	public static void main(String[] args) {
		Sape sp = new Sape();
		Circle sub = (Circle) sp;
		sub.draw(); // 접근 안됨.

		Sape ab = new Circle(); // 업캐스팅
		Circle ge = (Circle) ab; // 다운 캐스팅
		ge.draw(); // 안됨.

		Circle sub2 = (Circle) new Sape(); // 다운 캐스팅 아냐?
		Sape uu = sub2; // 이건 모야? 업캐스팅이양?
		System.out.println(sub2.age);

	}
}
