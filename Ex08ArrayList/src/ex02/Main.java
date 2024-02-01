package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		ArrayList<Student2> studentArr = new ArrayList<Student2>();
//
		Scanner sc = new Scanner(System.in);
//		for(int i =0; i < 3; i++) {
//			System.out.print("이름 입력해라 : ");
//			String name = sc.next();
//			System.out.print("성적 입력해라 : ");
//			int score = sc.nextInt();
//			
//			studentArr.add(new Student2(name,score));
//		}
//		
//		
//		for(Student2 x: studentArr) {
//			System.out.println(x.getName());
//			System.out.println(x.getScore());
//		}
		
		
		
		//--------------- 북 게임------------------------
		
		Library Lb = new Library();  // 도서관 먼저 생성.
		
		Book book1 = new Book("자바","황기태", "스마트인개", 2023, 50000);
		Book book2 = new Book("파이선","이건희", "삼성", 2043, 65000);
		Book book3 = new Book("cpp", "오진희", "sk", 2000, 50000);
		Book book4 = new Book("js","나인혜", "사피", 2001, 20000);
		
//		for(int i= 1; i < 4; i++) {
//			Lb.addBook(book );
//		}
		
		Lb.addBook(book1);
		Lb.addBook(book2);
		Lb.addBook(book3);
		Lb.addBook(book4);
		
//		Lb.serachBooks(book2.getTitle());
	    Lb.deleteBook(book4);
		
		
		
		
		
//		boolean ck = true;
//		while(Lb.size() < 4) {
//			System.out.print("책 이름 설정하세요. :");
//			String title = sc.next(); 
//			System.out.print("책 저자 설정하세요. :");
//			String author = sc.next(); 
//			System.out.print("책 출판사 설정하세요. :");
//			String publisher = sc.next(); 
//			System.out.print("책 년도 설정하세요. :");
//			int pubYear = sc.nextInt(); 
//			System.out.print("책 가격 설정하세요. :");
//			int price = sc.nextInt(); 
//			Book book1 = new Book(title,author, publisher, pubYear, price);
//			Lb.addBook(book1);
////		    Lb.Print(0);  // 확인용
//			
//		}
		
//		for() {
//			
//		}
//		
//		Lb.serachBooks(null)
		
		
		
		
		
		
		
	}

}
