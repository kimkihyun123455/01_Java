package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService extends Book{

	private Scanner sc = new Scanner(System.in);
	
	private List<Book> books = new ArrayList<>();

	private List<Book> loveIt = new ArrayList<>();
	
	public BookService() {}
	
	
	public BookService(int num, String name, String author, int price, String com) {
		super(num, name, author, price, com);
	}
	
	int input = 0;
	public void displayMenu() {
		
		do {
			System.out.println("\n======도서 목록 프로그램======");
			System.out.println("1.도서 등록\n");
			System.out.println("2.도서 조회\n");
			System.out.println("3.도서 수정\n");
			System.out.println("4.도서 삭제\n");
			System.out.println("5.즐겨찾기 추가\n");
			System.out.println("6.즐겨찾기 삭제\n");
			System.out.println("7.즐겨찾기 조회\n");
			System.out.println("8.추천도서 뽑기\n");
			System.out.println("0.프로그램 종료\n");
			System.out.print("메뉴를 입력하세요 : ");
			
			try {
				input = sc.nextInt();
				sc.nextLine();
			
			switch(input){
			case 1 : System.out.println(addBook()); break;
			case 2 : searchBook(); break;
			case 3 : updateBook(); break;
			case 4 : System.out.println(removeBook());break;
			case 5 : System.out.println(iLoveIt()); break;
			case 6 : System.out.println(removeILoved());break;
			case 7 : showILove(); break;
			case 8 : randomBook(); break;
			case 0 : System.out.println("프로그램 종료...");break;
			default : System.out.println("옳바른 숫자를 입력해주세요.");
			}
			}catch(InputMismatchException e){
				System.out.println("형식 맞춰서 입력하라고");
				sc.nextLine();
				input = 100;
			}
			
		}while(input !=0);
		
	}

	public String addBook() {
		
		System.out.println("======도서 등록======");
		
		System.out.print("도서 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("\n도서 제목 : ");
		String name = sc.nextLine();
		
		System.out.print("\n도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("\n도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("\n도서 출판사 : ");
		String com = sc.next();
		
		sc.nextLine();
		
		Book newbook = new Book(num, name, author, price, com);
		
		if(books.add(newbook)) {
			return "\n등록완료";
		}
		return "버그걸린듯";
	}
	
	public void searchBook() {
		System.out.println("======도서 조회======");
		for(Book book : books) {
			System.out.println();
			System.out.println(book);
		}
		
	}
	
	public void updateBook() {
		
		System.out.println("======도서 수정======");
		System.out.print("\n수정할 도서 번호를 입력하세요 : ");
		int bookNumber = sc.nextInt();
		System.out.println("\n1. 도서명");
		System.out.println("\n2. 도서 저자");
		System.out.println("\n3. 도서 가격");
		System.out.println("\n4. 도서 출판사");
		System.out.println("\n0. 수정 종료");
		
		System.out.print("어떤 정보를 수정하시겠습니까?");
		int update = sc.nextInt();
		
		for(int i=0;i<books.size();i++) {
			
			if((books.get(i)).getNum()==bookNumber) {
				switch(update) {
				
				case 1 : System.out.println("======도서명 수정======");
				System.out.print("수정할 도서명을 입력하세요 : ");
				(books.get(i)).setName(sc.nextLine());
				System.out.println("\n수정 완료"); break;
				
				case 2 : System.out.println("======도서 저자 수정======");
				System.out.print("수정할 저자명을 입력하세요 : ");
				(books.get(i)).setAuthor(sc.nextLine());
				System.out.println("\n수정 완료");break;
					
				case 3 : System.out.println("======도서 가격 수정======");
				System.out.print("수정할 도서 가격을 입력하세요 : ");
				(books.get(i)).setPrice(sc.nextInt());
				System.out.println("\n수정 완료");break;
				
				case 4 : System.out.println("======도서 출판사 수정======");
				System.out.print("수정할 출판사를 입력하세요 : ");
				(books.get(i)).setCom(sc.nextLine());
				System.out.println("\n수정 완료");break;
				
				default : break;
				}
			}
			
		}System.out.println("일치하는 도서 번호가 없습니다");
		
		
		/*switch(update) {
		case 1 : System.out.println("======도서명 수정======");
		System.out.println("수정할 가격을 입력하세요 : ");
		
		case 2 :
		case 3 : 	
		case 4 : 
		case 0 : 
		default : 
		}*/
	}
	
	public String removeBook() {
		System.out.println("======도서 삭제======");
		System.out.print("목록에서 삭제할 도서 번호를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(Book book : books) {
			
			if(book.getNum()==input) {
				String bookname = book.getName();
				books.remove(book);
				return "도서"+bookname+"이 목록에서 삭제되었습니다";
			}
			
		}return "일치하는 도서 번호가 없습니다";
		
	}
	
	public String iLoveIt() {
		System.out.println("======즐겨찾기 추가======\n");
		System.out.print("즐겨찾기 목록에 추가할 도서 번호를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(Book book : books) {
			
			if(book.getNum()==input) {
				loveIt.add(book);
				return "도서"+book.getName()+"이 즐겨찾기에 추가되었습니다";
			}
			
		} return "일치하는 도서 번호가 없습니다";
	}
	
	public void showILove() {
		System.out.println("======즐겨찾기 목록======\n");
		
		for(Book book : loveIt) {
			System.out.println(book);
		}
	}
	
	public String removeILoved() {
		System.out.println("======즐겨찾기 삭제======\n");
		System.out.print("즐겨찾기에서 삭제할 도서 번호를 입력하세요 :");
		int input = sc.nextInt();
		
		for(Book book : loveIt) {
			if(book.getNum()==input) {
				String bookName=book.getName();
				loveIt.remove(book);
				return "도서"+bookName+"이 즐겨찾기에서 삭제되었습니다";
			}
		}return "일치하는 도서번호가 없습니다";
		
	}
	
	public void randomBook() {
		
		Random random = new Random();
		
		System.out.println("======추천 도서 목록======");
		
		if(books.isEmpty()) {
			System.out.println("등록된 도서가 없습니다");
			return;
		}
		
		System.out.println(books.get(random.nextInt(books.size())));
		
	}
	
	
}
