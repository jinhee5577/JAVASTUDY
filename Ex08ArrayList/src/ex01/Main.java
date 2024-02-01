package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 객체 배열 만들기.
		 Student[] students = new Student[3];
		 Scanner sc = new Scanner(System.in);
		 
		// 학생정보 저장.
		 int cnt = 1;
		 while(cnt <= students.length) {
			 System.out.print("이름입력: ");
			 String name = sc.next();
			 System.out.print("성적입력 : ");
			 int score = sc.nextInt();
			 
			 students[cnt-1] = new Student(name, score);
			 cnt++;
			 System.out.println();
		 }
		 
		// 학생정보  출력.
		 for(Student x : students) {
			 System.out.println(x.getName()+ " : " + x.getScore());
			 
		 }
	

		
		
		

	}

}
