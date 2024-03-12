package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();
		
		while(true) {
			System.out.print("추가할 이름을 입력하세요 : ");
			String name = sc.next();
			//오류1(if~elseif~else)
			//오류2(equals)
			//if(name == "clear")
			if(name.equals("clear")) {
				//오류3
				//continue;
				System.out.println("이름 목록을 초기화 합니다.");
				nameList.clear();
			}
			//if(name == "exit")
			else if(name.equals("exit")) {
				System.out.println("<<입력 종료>>");
				for(String n:nameList) {
					System.out.println(n);
				}
				return;
			}
			else {
				if(nameList.contains(name)) {
					System.out.println("<이미 존재하는 이름입니다.>");
				}
				else {
					//오류4
					nameList.add(name);
					System.out.println(name+" 추가완료.");
				}
			}
		}
		//오류5
		/*
		for(String name:nameList) {
			System.out.println(name);
		}
		*/
	}
}
