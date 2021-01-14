package io4;

public class Ex1 {

	public static void main(String[] args)throws Exception {
		
		//리플렉션
		//임의의 클래스를 가져온다.
		//if-else 사용하지 않는다.
		String name="io4.AJob";
		//드라이버 로드
		Class clz = Class.forName(name);
		
		System.out.println(clz);
		
		Job obj = (Job)clz.getConstructors()[0].newInstance(null);
		
		System.out.println(obj);
		
		obj.doJob();
	}
	
}
