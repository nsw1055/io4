package io4;

public class Ex1 {

	public static void main(String[] args)throws Exception {
		
		//�����ڵ�
		//�� ���ڿ��� �ٲٸ� Ŭ���� ���� ����
		//if-else ������� �ʾƵ� �ȴ�.
		String name="io4.AJob";
		
		Class clz = Class.forName(name);
		
		System.out.println(clz);
		
		Job obj = (Job)clz.getConstructors()[0].newInstance(null);
		
		System.out.println(obj);
		
		obj.doJob();
	}
	
}
