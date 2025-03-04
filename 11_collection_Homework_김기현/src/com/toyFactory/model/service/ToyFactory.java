package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {

	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toy = new LinkedHashSet<>();
	private Map<Integer, String> mat = new HashMap<>();
	
	
	public ToyFactory() {
		
		mat.put(1, "면직물");
		mat.put(2, "플라스틱");
		mat.put(3, "유리");
		mat.put(4, "고무");
		
		Set<String> longleg = new HashSet<>();
		longleg.add(mat.get(1));
		longleg.add(mat.get(4));
		
		Set<String> hugiwogi = new HashSet<>();
		hugiwogi.add(mat.get(1));
		hugiwogi.add(mat.get(2));
		
		Set<String> kisimisi = new HashSet<>();
		kisimisi.add(mat.get(1));
		kisimisi.add(mat.get(2));
		
		Set<String> catnap = new HashSet<>();
		catnap.add(mat.get(1));
		catnap.add(mat.get(2));
		
		Set<String> poppy = new HashSet<>();
		poppy.add(mat.get(1));
		poppy.add(mat.get(2));
		poppy.add(mat.get(4));
		
		
		toy.add(new Toy("마미롱레그",8,36000,"분홍색","19950805",longleg));
		toy.add(new Toy("허기워기",5,12000,"파란색","19940312",hugiwogi));
		toy.add(new Toy("키시미시",5,15000,"분홍색","19940505",kisimisi));
		toy.add(new Toy("캣냅",8,27000,"보라색","19960128",catnap));
		toy.add(new Toy("파피",12,57000,"빨간색","19931225",poppy));
		
		
		
	}
	



	public void displayMenu() {
		
		int menuNum=8;
		
		do{
		System.out.println("<<플레이타임 공장>>");
		System.out.println("1.전체 장난감 조회하기");
		System.out.println("2.새로운 장난감 만들기");
		System.out.println("3.장난감 삭제하기");
		System.out.println("4.장난감 제조일 순으로 조회하기");
		System.out.println("5.연령별 사용 가능한 장난감 리스트 조회하기");
		System.out.println("6.재료 추가");
		System.out.println("7.재료 제거");
		System.out.println("8.퇴근하기");
		System.out.print("선택 : ");
		menuNum = sc.nextInt();
		sc.nextLine();
		
		switch(menuNum) {
		case 1 :viewMenu(); break;
		case 2 :System.out.println(addPoppy());break;
		case 3 :System.out.println(deletePoppy());break;
		case 4 :arrayMade();break;
		case 5 :break;
		case 6 :System.out.println(addMat());break;
		case 7 :System.out.println(removeMat());break;
		case 8 :System.out.println("파피가 당신에게 손을 흔듭니다");break;
		default : System.out.println("옳바른 명령을 입력하세요");
		
		}
		}while(menuNum!=8);
		
		
		
		
		
		
	}
	
	public void viewMenu() {
		if(toy.isEmpty()) {
			System.out.println("등록된 장난감이 없습니다.");
		}
		
		List<Toy> list = new ArrayList<>(toy);
		
		for(int i =0;i<toy.size();i++) {
			System.out.println((i+1)+". "+list.get(i));
		}
		
	}
	
	public String addPoppy() {
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String newName = sc.nextLine();
		
		System.out.print("사용 가능 연령 : ");
		int newAge = sc.nextInt();
		sc.nextLine();
		
		System.out.print("가격 : ");
		int newPrice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("색상 : ");
		String newColor = sc.nextLine();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력하세요) : ");
		String newMade = sc.next();
		sc.nextLine();
		
		Set<String> doll = new HashSet<>();
		
		while(true) {
			
		System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
		String newmat = sc.nextLine().toLowerCase();
		
		if(newmat.equals("q")) {
			break;
		}
		doll.add(newmat);
		
		}
		
		toy.add(new Toy(newName,newAge,newPrice,newColor,newMade,doll));
		
		return "새로운 장난감이 추가되었습니다";
	}
	
	public String deletePoppy() {
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String deleteName = sc.nextLine();
		
		for(Toy t : toy){
			if(t.getName().equals(deleteName)) {
				toy.remove(t);
				return "장난감이 삭제되었습니다";
			}
		}
		
		return "일치하는 인형이 없습니다";
		
	}
	
	public void arrayMade() {
		System.out.println("<제조일 순으로 장난감을 정렬>");
		
		List<Toy> toylist = new ArrayList<>(toy);
		
		Collections.sort(toylist, new Comparator<Toy>() {

			@Override
			public int compare(Toy t1, Toy t2) {
				return t1.getMade().compareTo(t2.getMade());
			}
			
		});
		
		for(Toy t : toylist) {
			System.out.println(t);
		}
		
	}
	
	public void arrayAge() {
		
		List<Toy> toylist = new ArrayList<>(toy);
		
		Collections.sort(toylist);
		
		Map<Integer, Toy> agemap = new HashMap<>();
		

			
		
		
		
		
	}
	
	public String addMat() {
		
		System.out.println("<재료 추가>");
		System.out.println("===현재 등록된 재료===");
		
		mat.keySet();
		
		for(Integer k : mat.keySet()) {
			String value = mat.get(k);
			System.out.println(k +" : "+ value);
		}
		
		System.out.println("======================");
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int key = sc.nextInt();
		sc.nextLine();
		
		System.out.print("재료명 입력 : ");
		String ma = sc.nextLine();
		
		if(mat.containsKey(key)) {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다");
			System.out.print("덮어쓰시겠습니까?(y/n) : ");
			char yesno = sc.next().toLowerCase().charAt(0);
			
			if(yesno!='y') {
				return "취소되었습니다";
			}else {
				mat.put(key, ma);
				return "재료가 성공적으로 덮어쓰기 되었습니다";
			}
			
		}
		else {
			mat.put(key, ma);
			return "새로운 재료가 성공적으로 등록되었습니다";
		}
		
		
		
		
		
		
	}
	
	public String removeMat() {
		
		System.out.println("<재료 삭제>");
		System.out.println("===현재 등록된 재료===");
		
		mat.keySet();
		
		for(Integer k : mat.keySet()) {
			String value = mat.get(k);
			System.out.println(k +" : "+ value);
		}
		
		System.out.println("======================");
		
		System.out.print("삭제할 재료명 입력 : ");
		String delete = sc.nextLine();
		
		if(mat.containsValue(delete)) {
			
			for(Integer key : mat.keySet()) {
				if(mat.get(key).equals(delete)) {
					mat.remove(key);
					return "재료 '"+delete+"'가 성공적으로 제거되었습니다.";
				}
			}
			
			
		}else {
			return "해당 이름의 재료가 존재하지 않습니다";
		}
		
		return "";
		
	}
	

}
