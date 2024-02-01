package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex00Basic {

	public static void main(String[] args) {
		// 1. ArrayList 만들기
		// int[] 변수명 = new int[배열크기];
		
		// ArrayList<데이터타입> 변수명 = new ArrayList<>();
		
		
		// ex01) 우리팀원을 담아 둘수 있는 ArrayList 만들기.
		// new 뒤에 데이터타입은 생략이 가능하다.
		ArrayList<String> team = new ArrayList<String>(); 
		
		// 1>팀원 이름 추가하기.
		team.add("오진희");
		team.add("나인혜");
		team.add(1,"송은호");
		
		// 2> 팀원 이름 출력하기.
		System.out.println(team.get(0));
		System.out.println(team.get(1));
		System.out.println(team.get(2));
		
		
		// 3> 팀원삭제.
		team.remove(1);
		System.out.println(team.get(0));
		System.out.println(team.get(1));
		team.add("송승영");
		team.add("송승영");
		team.add("송승영");
		team.remove("송승영");
		
		System.out.println(team.get(0));
		System.out.println(team.get(1));
		System.out.println(team.get(2));
		System.out.println(team.get(3));
		System.out.println();
		System.out.println("===========2번 인덱스 출력========");
		
		// 팀원변경하기
		team.set(2, "남주혁");
		System.out.println(team.get(2));
		// 사이즈 출력하기.
		System.out.println(team.size()); 
		
		
		//================================
		ArrayList<Integer> nums = new ArrayList<>();
		ArrayList<Double> nums2 = new ArrayList<>();
		ArrayList<Float> nums3 = new ArrayList<>();
		ArrayList<Byte> nums4 = new ArrayList<>();
		List<Short> nums5 = new ArrayList<>();
		ArrayList<Character> nums6 = new ArrayList<>();
		ArrayList<Boolean> nums7 = new ArrayList<>();
		// Integer, Double, Float, Byte, Short, Long, Character, Boolean
		
		// ArrayList에 <>안에는 wrapper Class가 들어간다.


	}

}
