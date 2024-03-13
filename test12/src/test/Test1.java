package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//오류1. List = 인터페이스 이므로 생성할 수 없다.
		//		ipInfoList는 ArrayList로 생성해야 하지만, null로 대입하였으므로 ipInfoList.add의 13~15 문장은 NullPointerException 오류 발생
		//List<IPInfo> ipInfoList = null;
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>();
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		//오류2. 생성자함수 오류
		//		: IPInfo 클래스에서 매개변수 하나만 전달받는 생성자는 없으므로 객체 생성이 불가능하다. 
		//ipInfoList.add(new IPInfo("212.133.7.8"));
		ipInfoList.add(new IPInfo("212.133.7.8", "둘리"));
		ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));
		
		System.out.print("ip 입력 : ");
		String ip = sc.next();
		
		for(int i=0;i<ipInfoList.size();i++) {
			//오류3. if조건식
			//		: ipInfoList.get(i)는 특정 번째의 IPInfo 클래스의 객체이고, ip는 String 변수이므로 
			//contains : 객체 비교 / equals : 문자열 비교
			//if(ipInfoList.get(i) == ip)
			if(ipInfoList.get(i).getIp().equals(ip)) {
				System.out.println(ipInfoList.get(i));
				break;
			}
			else {
				System.out.println("일치하는 ip 사용자가 없습니다.");
			}
		}
		//오류4
		//System.out.println("일치하는 ip 사용자가 없습니다.");
	}
}
