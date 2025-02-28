package com.hw3.model.dto;

public class Book {
	
	private int num;
	private String name;
	private String author;
	private int price;
	private String com;
	
	public Book() {}

	public Book(int num, String name, String author, int price, String com) {
		super();
		this.num = num;
		this.name = name;
		this.author = author;
		this.price = price;
		this.com = com;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}
	
	@Override
	public String toString() {
		return String.format("%s번 도서 : [도서제목 : %s / 도서저자 : %s / 도서가격 : %d원 / 출판사 : %s]", num, name, author, price, com);
	}
		
	
	
	
	
	
	
}
