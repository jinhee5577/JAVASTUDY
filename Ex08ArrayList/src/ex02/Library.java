package ex02;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<>();
	
	
	public void addBook (Book book) { // 책추가
		books.add(book);		
	}
	public void Print (int ind) { // 잘들어 갔는지 확인용.
		System.out.println(books.get(ind).getTitle());	
	}
	
	public Book serachBooks (String bookNA) { // 책찾자.
	   int ind = books.indexOf(bookNA);
	   return books.get(ind);
	}
	
	public void deleteBook (Book book) { // 책버려.		
		if(books.contains(book)) {
			int ind =books.indexOf(book);
			books.remove(book);
			System.out.println("책 삭제 되었습니다.");
		}
				
	}
	public void printAllBooks (Book book) { // 책 정보 출력.
		
//		for(Book x: books) {
//			System.out.println(x);
//		}
		
		if(books.contains(book)) {
			int ind =books.indexOf(book);
			books.get(ind);
			System.out.println(book.getTitle());
		}		
	}
	
	public int size () {
		return books.size();
		
	}
	
	
	
	
}
