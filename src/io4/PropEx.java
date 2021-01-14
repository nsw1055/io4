package io4;

import java.io.FileInputStream;
import java.util.Properties;

public class PropEx {

	// bad code
	public static void main(String[] args) throws Exception {

		// {키 = 값 , 키 = 값}
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\zzz\\job.properties"));
		System.out.println(prop);

		String str = prop.getProperty("/order");
		System.out.println(str);

		Class clz = Class.forName(str);

		System.out.println(clz);

		Job obj = (Job) (clz.getConstructors()[0].newInstance(null));

		System.out.println(obj);

		obj.doJob();
	}
}
