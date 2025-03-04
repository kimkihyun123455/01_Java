package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {

	//Map : Key와 Value 한쌍이 데이터가 되어 이를 모아둔 객체를 의미한다
	//Key : Value -> Entry라고 부름
	
	
	//Key를 모아두면 중복이 허용되지 않는다는 특성으로 인해 Set와 유사하다
	//Value를 모아두면 중복이 가능하다는 특성으로 인해 List와 유사하다
	
	
	public void ex1() {
		
		//HashMap<K, V> : Map의 자식 클래스 중 가장 대표되는 Map
		Map<Integer, String> map = new HashMap<>();
		
		//Map.put(Integer, String) : Map에 추가
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
		
		//key 중복테스트
		map.put(1, "김기현");//중복 허용x 대신 Value 덮어쓰기
		
		//value 중복테스트
		map.put(7, "고길동");//중복 허용
		
		System.out.println(map); // map.toString() 오버라이딩 되어 있다
		
		
		
	}
	
	
	public void ex2() {
		
		//DTO(값 저장용 객체) : 특정 데이터 묶음의 재사용이 많은 경우 사용
		//재사용이 적은 DTO는 코드 낭비
		//Map을 이용해서 DTO와 비슷한 코드를 작성할 수 있음
		
		//1.DTO 버전
		
		Member member = new Member();
		
		member.setId("userId");
		member.setPw("pass01");
		member.setAge(30);
		
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());
		
		//2.Map 버전
		Map<String, Object> map = new HashMap<>();
		//value가 object 타입 == 어떤 객체타입이든 value에 대입이 가능하다
		
		map.put("id", "user01");
		map.put("pw", "pass01");
		map.put("age", 30);
		
		//Object(Value) 를 반환하는 Map.get(String Key): 매개변수로 전달 받은 Key와 대응되는 Value 반환
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("age"));
		
		System.out.println("============================");
		
		//map에 저장된 데이터에 순차적으로 접근하기
		
		//map에서 key만 모아두면 set의 특징을 가진다
		//이를 활용해 keySet()를 사용 key만 모아 Set으로 반환
		
		Set<String> set = map.keySet();// id, pw, age가 저장된 Set 반환
		
		System.out.println("keySet() : "+ set);
		
		//향상된 for문사용 가능
		
		for(String key : set) {
			System.out.println(map.get(key));
		}
		
		//map에 저장된 데이터가 많거나 어떤 key가 있는지 불분명할 때 
		//또는 map에 저장된 모든 데이터에 접근해야 할 경우
		//keySet() + 향상된 for문 사용
		
		
		
		
		
		
		
		
		
	}
	
	public void ex3() {
		
		//List 안에 Map 넣기
		
		List<Map<String, Object>> list = new ArrayList<>();
		//List 객체만 생성되었고, 해당 list에는 Map만 들어올 수 있음을 제한
		
		for(int i = 0; i<10; i++) {
			
			//반복할 때 마다 Map객체 생성
			Map<String, Object> map = new LinkedHashMap<>();//HashMap은 순서를 보장하지 않는다
			
			map.put("id", "user0"+i);
			map.put("pw", "pass0"+i);
			
			//Map을 List에 추가
			list.add(map);
			
		}
		
		//for문 종료 시 list에 10개의 Map객체가 추가된다
		System.out.println(list);
		
		//향상된 for문 이용하여 key가 "id"에 대응되는 value값 전부 출력하기
		
		for(Map<String, Object> temp : list) {
			System.out.println(temp.get("id"));
		}
		
		
		
	}
	
}
