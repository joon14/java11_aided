package test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		//오류1. List = 인터페이스 이므로 생성할 수 없다. list는 ArrayList로 생성해야 하지만, null로 대입하였으므로 list.add의 13~17 문장은 NullPointerException 오류 발생
		//List<Integer> list = null;
		List<Integer> list = new ArrayList<Integer>();
		//[★]선생님 답1 : "list 선언만 있으므로 객체 생성이 되어 있지 않아" NullPointerException이 발생
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		//오류2. list는 Integer인 정수값을 받을 수 있음(-> List<Integer> list), 1.23456은 실수형이므로 받을 수 없는 오류 발생
		//list.add(1.23456);
		list.add(1);	//결과값이 + 하나가 출력되어야하므로 list.add(1)로 변경해야한다.
		//[★]선생님 답2 : List의 선언 시 요소의 데이터 타입이 Integer(참조형 / int(기본형)은 쓰일 수 없음)로 설정되어 있으므로 정수만 입력 받을 수 있으므로 타입 오류 발생
		
		for(int num:list) {
			char ch;
			//오류3. if조건식 : num이 음수일 경우에 -를 출력해야 하지만, num<=0 이면 0일때 -가 출력되는 오류 발생
			//if(num<=0)
			if(num < 0) {	//[★]선생님 답3 : "if문의 조건에서 0을 포함하여 음수라고 표현했으므로" 0이여도 음수가 발생하고, 0인 경우에 정상적으로 처리되어야 할 else문이 실행되지 않는 알고리즘 오류 발생
				ch = '-';
			}
			else if(num > 0) {
				ch = '+';
			}
			else {
				System.out.println("@@@@@@@@@@");
				continue;
			}
			//오류4. for문 조건식 : i<Math.abs(num) 이면 ch가 (절대값의 크기-1)만큼 반복되어 출력되는 오류 발생
			//for(int i=1; i<Math.abs(num);i++)
			for(int i=1; i<=Math.abs(num);i++) {	//[★]선생님 답4 : for 반복문의 실행 조건이 해당 숫자를 포함하는 것이 아닌 작을 때까지만 실행하게 되어, 해당 숫자의 횟수만큼 부호를 출력해야 되는데 한 번씩 덜 출력
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
