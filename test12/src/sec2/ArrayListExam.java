package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
	public static void main(String[] args) {
		List<Member> memList = new ArrayList<Member>();
		List<Member> memList2 = new ArrayList<Member>();
		
		for(int i=1; i<=10; i++) {
			//Member(int num, String name, String id, String pw)
			Member mem = new Member(i, "Jung"+i, i+"J", "abcd"+i);
			memList.add(mem);
		}
		
		Member mem2 = new Member(11, "Cho", "C", "abcde");
		memList.add(mem2);
		
		for(Member m:memList) {	//List 순회1
			System.out.println(m.toString());
		}
		
		memList.remove(3);	//인덱스가 3인 Member 인스턴스가 제거
		
		//Member tmp = new Member(11, "Cho", "C", "abcde");
		//System.out.println(tmp.getId()+"의 존재 유무 : "+memList.contains(tmp));
		System.out.println(mem2.getId()+"의 존재 유무 : "+memList.contains(mem2));
		
		System.out.println();
		
		for(int i=0; i<memList.size(); i++) { //List 순회2
			Member m = memList.get(i);	//접근
			System.out.println(m.toString());
		}
		
		System.out.println();
		
		if(memList2.isEmpty()) {
			System.out.println("List is Empty.");
		}
		else {
			System.out.println("List is not Empty.");
		}
		
		System.out.println();
		
		List<String> names = new ArrayList<>();
		names.add("Lee1");
		names.add("Lee2");
		names.add("Lee3");
		names.add("Lee4");
		//names.add("Lee5");
		names.add("Lee6");
		names.add("Lee7");
		names.set(2, "Lee_N");
		
		if(names.contains("Lee5")) {
			System.out.println("Contain");
		}
		else {
			System.out.println("Not Contain");
			names.add("Lee5");
		}
		for(String s:names) {
			System.out.println(s);
		}
		
		System.out.println();
		
		names.clear();
		if(names.isEmpty()) {
			System.out.println("Empty");
		}
		else {
			for(String s:names) {
				System.out.println(s);
			}
		}
		
		//(★)자주 사용하는 메소드 : add, remove, contains, isEmpty, size, get
	}
}
