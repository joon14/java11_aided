package sec4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Set : 값만 저장, 중복 허용하지 않음. 순서 유지 하지 않음
//Set 종류 : HashSet, TreeSet
public class SetExam {
	public static void main(String[] args) {
		//Set의 선언 및 생성
		Set<String> set1 = new HashSet<>();
		Set<Integer> set2 = new TreeSet<>();
		
		set1.add("jung");	//요소의 추가
		set1.add("lee");
		set1.add("cho");
		set1.add("kim");
		set1.add("han");
		set1.add("jung");	//중복 발생 -> 중복을 허용하지 않음
		set1.add("kang");
		set1.add("kwon");
		
		System.out.println("요소의 수 : "+set1.size());
		System.out.println(set1);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		if(set1.contains(name)) {
			System.out.println("해당 이름이 존재합니다.");
		}
		else {
			System.out.println("해당 이름이 존재하지 않아 추가됩니다.");
			set1.add(name);
			System.out.println(name+"이 추가되었습니다.");
		}
		
		//특정 요소 삭제
		set1.remove("kwon");
		//set1 비우기
		set1.clear();
		
		if(set2.isEmpty()) {	//set2가 비어있는지 확인
			System.out.println("set2가 비어있습니다.");
		}
		else {
			System.out.println("set2의 요소의 수 : "+set2.size());
		}
		
		System.out.println();
		
		Set<Integer> set3 = new TreeSet<>(Arrays.asList(9,3,4,6,8,7,6));
		System.out.println(set3);
		
		//Set 의 순회1 -> 향상된 for 문 
		System.out.println("\n향상된 for 문에 의한 순회");
		for(Integer i:set3) {
			System.out.print(i+"\t");
		}
		
		//Set 의 순회2 -> Iterator 에 의한 순회
		System.out.println("\nIterator 에 의한 순회");
		Iterator it = set3.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
	}
}
