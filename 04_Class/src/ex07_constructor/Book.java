package ex07_constructor;

public class Book {
		//필드
	
	
	String title;
	String author;
	int price;
	
	
	
	//생성자   !!! 값을 받아서 필드 값을 채운다 !!!
	
	Book(String bookTitle){ 
		title = bookTitle;
		author = "미 상" ;
	
	}
	
	Book(String bookTitle, String bookAuthor){ 
		title =  bookTitle ;
		author = "허균" ;
		price= 0;
	}
	
	Book(String bookTitle, String bookAuthor, int bookPrice){ 
		title = bookTitle ;
		author = bookAuthor ;
		price= bookPrice;
	}
	
	
	
	
	//메소드
	void info() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price);
	}
	
	
	
}
