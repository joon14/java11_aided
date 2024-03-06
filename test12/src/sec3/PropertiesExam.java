package sec3;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExam {
	public static void main(String[] args) {
		//Properties 선언 및 생성
		Properties pro = new Properties();
		
		pro.setProperty("job", "developer");		//"job" element
		pro.setProperty("name", "jung");
		pro.setProperty("age", "27");
		pro.setProperty("local", "dongdaemungu");
		
		System.out.println(pro);
		System.out.println("엘리먼트 수 : "+pro.size());
		System.out.println("pro의 name 엘리먼트 값 : "+pro.getProperty("name"));
		
		//Properties 순회 => 열거형으로 해당하므로, 엘리먼트의 키(속성)를 가져와 처리해야함.
		Enumeration e = pro.propertyNames();
		while(e.hasMoreElements()) {
			String el = (String) e.nextElement();
			System.out.println(el+" : "+pro.getProperty(el));
		}
	}
}
