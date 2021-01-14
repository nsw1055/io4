package io4;

public class Ex1 {

	public static void main(String[] args)throws Exception {
		
		//동적코딩
		//이 문자열만 바꾸면 클래스 변경 가능
		//if-else 사용하지 않아도 된다.
		String name="io4.AJob";
		
		Class clz = Class.forName(name);
		
		System.out.println(clz);
		
		Job obj = (Job)clz.getConstructors()[0].newInstance(null);
		
		System.out.println(obj);
		
		obj.doJob();
	}
	
}
