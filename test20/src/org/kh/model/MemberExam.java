package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;

public class MemberExam {
	Scanner sc = new Scanner(System.in);
	List<Member> memList = new ArrayList<>();
	public static void main(String[] args) {
		MemberExam app = new MemberExam();
		app.maincall();
	}
	//메뉴를 반복 호출하고, 키보드에서 각 해당 번호를 누르면 각 작업이 이루어 질 수 있도록 하시오.
	public void maincall() {	
		//1. 회원 가입, 2. 회원 목록, 3. 회원 삭제, 4. 프로그램 종료
		
		boolean sw = true;
		
		while(sw) {
			System.out.println("\n******************[ 회원 관리 프로그램 ]******************");
			System.out.println("1. 회원 가입, 2. 회원 목록 확인, 3. 회원 탈퇴, 4. 프로그램 종료");
			System.out.println();
			System.out.print("이용하실 작업의 번호를 입력하세요 : ");
			int job = sc.nextInt();
			switch(job) {
				case 1:
					add();
					break;
				
				case 2:
					info();
					break;
					
				case 3:
					remove();
					break;
					
				case 4:
					sw = false;
					System.out.println("[ 프로그램을 종료합니다. ]");
					break;
					
				default:
					System.out.println("[Warning : 잘못된 선택입니다. 번호를 다시 입력해주세요! ]");
			}
		}
	}
	
	int no = 0;
	public void add() {
		Member mem = new Member();
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		mem.setId(id);
		
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = sc.next();
		mem.setPw(pw);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		mem.setName(name);
		
		System.out.print("출생년도를 입력하세요 : ");
		int year = sc.nextInt();
		mem.setYear(year);
		
		System.out.print("전화번호를 입력하세요 : ");
		String tel = sc.next();
		mem.setTel(tel);
		
		mem.setMcode(no+=1);
		
		memList.add(mem);
		System.out.println("[ 회원 가입이 완료되었습니다. ]");
	}
	
	public void info() {
		if(memList.isEmpty()) {
			System.out.println("[ 가입된 회원 정보가 없습니다. ]");
		}
		for(Member m:memList) {	
			System.out.println(m.toString());
		}
	}
	
	public void remove() {
		System.out.print("탈퇴할 회원의 아이디를 입력해주세요 : ");
		String id = sc.next();
		System.out.print("탈퇴할 회원의 비밀번호를 입력해주세요 : ");
		String pw = sc.next();
		
		for(int i=0; i<memList.size(); i++) {
			if(memList.get(i).getId().equals(id) && memList.get(i).getPw().equals(pw)) {
				System.out.println("[ 회원 탈퇴가 완료되었습니다. ]");
				memList.remove(i);
			}
		}
	}
}
