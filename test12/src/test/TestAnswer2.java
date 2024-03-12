package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//이름목록의 작성 : 키보드로 이름을 입력받아 이름목록(nameList)에 추가하되, 
//입력 값이 clear이면, 이름목록을 초기화
//입력 값이 exit이면, 반복루프를 종료
//만약, 기존값과 중복된 내용이 있으면, "이미 존재하는 이름입니다." 메시지를 출력하고, 계속 입력모드로 진행되며,
//만약, 입력값에 대한 이름이 존재하지 않으면, 이름목록에 이름을 추가하고, 반복이 종료되면, 이름목록을 출력
public class TestAnswer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();
		
		while(true) {
			System.out.print("추가할 이름을 입력하세요 : ");
			String name = sc.next();
			//오류1(equals) : String 비교는 == 이 아니고, equals를 써야하므로 == 를 사용하였을 경우 정상비교가 되지 않는다.
			//if(name == "clear")
			if(name.equals("clear")) {
				//오류2 : continue 구문이 실행해야할 다른 문장보다 앞서 있어서 continue 구문 이후의 문장이 실행되지 않음
				//continue;
				System.out.println("이름 목록을 초기화 합니다.");
				nameList.clear();
				continue;
			}
			//if(name == "exit")
			if(name.equals("exit")) {
				System.out.println("<<입력 종료>>");
				//오류3 : exit가 입력될 경우 아래 반복 출력문장을 실행하지 못하고, main 함수(메소드)의 밖으로 탈출해버린다.
				//return;
				break;
			}
			if(nameList.contains(name)) {
				System.out.println("<이미 존재하는 이름입니다.>");
			}
			else {
				//오류4 : 이름목록(nameList)에 이름을 추가하는 구현 코드의 누락으로 인해 추가하지 못함. 
				nameList.add(name);
				System.out.println(name+" 추가완료.");
			}
			
		}
		for(String name:nameList) {
			System.out.println(name);
		}
	}
}
