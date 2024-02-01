package DTO;

public class MemberDTO {
	// DTO = VO 둘중 하나써도 상관없다.
	// model 이다. 데이터를 보관하고 있어서. 데이터가 들어올때마다 바뀐다.
	// Data Transfer Object -- 데이터가 하나씩 담길 객체.
	// 테이블 1당 1개의 객체를 가지고 잇어야한다.
	// 데이터 변환 객체 -- MemberDTO member테이블에 있는 정보를 담아주겠습니다!.
	
	//member 테이블에 있는 컬럼 전부 작성!.
	
	private String id;
	private String pw;
	private String name;
	private int age;
	
	// 생성자 - 역할: 객체를 생성할때 최초로 실행하는 코드.
	// 생성자 리턴타입 작성하지 않음.
	public MemberDTO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}	
	
	
	// getter
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
	
}
