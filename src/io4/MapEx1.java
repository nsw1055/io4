package io4;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	//bad code
	public static void main(String[] args)throws Exception {
		//  <Ű    , ��    >    ������ : HashMap, TreeMap
		Map<String, Job> map = new HashMap<>();
		
		//map.put�� �����͸� �Է�
		map.put("A", new AJob());
		//map�� Ű�� ������ �����.
		map.put("A", new AJob());
		map.put("B", new BJob());
		
		//map.get�� �����͸� ���
		Job target = map.get("A");
		target.doJob();
		
		
//		System.out.println(map);
//		
//		//Ű�� ��Ÿ�� �������� �ߺ��� ������ �ʴ´�.
//		//map.keySet().forEach(�ڵ带 ���� �ִ´�);
//		map.keySet().forEach(key -> System.out.println(key));
//		
//		//���� ��Ÿ�� �������� �ߺ��� ������ �ʴ´�.
//		//map.values().forEach(�ڵ带 ���� �ִ´�);
//		map.values().forEach(value -> System.out.println(value));
//		
//		if(map.get("2") == null){
//			System.out.println("NOT EXIST");
//		}
//		
//		
	}
}
