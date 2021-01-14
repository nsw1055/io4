package io4;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	//bad code
	public static void main(String[] args)throws Exception {
		//  <키   ,  값    >  = 저장방식 : HashMap, TreeMap
		Map<String, Job> map = new HashMap<>();
		
		//map.put은 입력한다
		map.put("A", new AJob());
		//map.put의 키값이 같으면 덮어 씌운다
		map.put("A", new AJob());
		map.put("B", new BJob());
		
		//map.get 출력한다.
		Job target = map.get("A");
		target.doJob();
		
		
//		System.out.println(map);
//		
//		//map안의 키를 가져온다.
//		//map.keySet().forEach(코드작성);
//		map.keySet().forEach(key -> System.out.println(key));
//		
//		//map안의 값을 가져온다
//		//map.values().forEach(코드작성);
//		map.values().forEach(value -> System.out.println(value));
//		
//		if(map.get("2") == null){
//			System.out.println("NOT EXIST");
//		}
//		
//		
	}
}
