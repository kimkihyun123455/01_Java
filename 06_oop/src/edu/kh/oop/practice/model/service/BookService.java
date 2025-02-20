package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {

	public void practice() {
		Book book = new Book();
		Book book2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		Book book3 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		
		System.out.println(book.toString());
		System.out.println(book2.toString());
		
		book3.setTitle("C언어");
		book3.setPrice(30000);
		book3.setDiscountRate(0.1);
		book3.setAuthor("홍길동");
		System.out.println("=============================");
		System.out.println("수정된 결과 확인");
		System.out.println(book3.toString());
		System.out.println("=============================");
		
		System.out.println("도서명 = "+book2.getTitle());
		System.out.println("할인된 가격 = "+book2.getPrice()*(1-book2.getDiscountRate()));
		System.out.println("도서명 = "+book3.getTitle());
		System.out.println("할인된 가격 = "+book3.getPrice()*(1-book3.getDiscountRate()));
		
	}
}
