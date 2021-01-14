package io4;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	//bad code
	public static void main(String[] args)throws Exception {
		//  <키    , 값    >    저장방법 : HashMap, TreeMap
		Map<String, Job> map = new HashMap<>();
		
		//map.put는 데이터를 입력
		map.put("A", new AJob());
		//map은 키가 같으면 덮어쓴다.
		map.put("A", new AJob());
		map.put("B", new BJob());
		
		//map.get는 데이터를 출력
		Job target = map.get("A");
		target.doJob();
		
		
//		System.out.println(map);
//		
//		//키를 나타냄 집합형식 중복은 허용되지 않는다.
//		//map.keySet().forEach(코드를 집어 넣는다);
//		map.keySet().forEach(key -> System.out.println(key));
//		
//		//값을 나타냄 집합형식 중복은 허용되지 않는다.
//		//map.values().forEach(코드를 집어 넣는다);
//		map.values().forEach(value -> System.out.println(value));
//		
//		if(map.get("2") == null){
//			System.out.println("NOT EXIST");
//		}
//		
//		
	}
}
