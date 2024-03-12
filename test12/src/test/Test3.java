package test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		//오류1. List = 인터페이스 이므로 생성할 수 없다.
		//		list는 ArrayList로 생성해야 하지만, null로 대입하였으므로 list.add의 13~17 문장은 NullPointerException 오류 발생
		//List<Integer> list = null;
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		//오류2. list는 Integer인 정수값을 받을 수 있음(-> List<Integer> list), 1.23456은 실수형이므로 받을 수 없는 오류 발생
		//list.add(1.23456);
		list.add(1);
		
		for(int num:list) {
			char ch;
			//오류3. if조건식 : num<=0 이면 0일때 -가 출력되는 오류 발생
			//if(num<=0)
			if(num < 0) {
				ch = '-';
			}
			else if(num > 0) {
				ch = '+';
			}
			else {
				System.out.println("@@@@@@@@@@");
				continue;
			}
			//오류4. for문 조건식 : i<Math.abs(num) 이면 절대값의 크기의 -1만큼 출력이 되는 오류 발생
			//for(int i=1; i<Math.abs(num);i++)
			for(int i=1; i<=Math.abs(num);i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
