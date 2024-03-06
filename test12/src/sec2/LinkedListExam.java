package sec2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	public static void main(String[] args) {
		List<Student> sList = new LinkedList<>();
		
		//Student(int no, String name, int point)
		Student s1 = new Student();
		s1.setNo(1);
		s1.setName("Jung");
		s1.setPoint(80);
		sList.add(s1);
		
		Student s2 = new Student(2, "Cho", 100);
		sList.add(s2);
		
		sList.add(new Student(3, "Kim", 90));
		
		sList.add(new Student());
		sList.set(3, new Student(4, "Kang", 75));
		
		System.out.println("Number\tName\tPoint");
		for(Student s:sList) {
			System.out.println(s.getNo()+"\t"+s.getName()+"\t"+s.getPoint());
		}
		
		//ArrayList 는 내용이 없는 인스턴스의 메모리가 그대로 차지하고 있으나,
		//Vector 는 내용이 없으면 메모리에서 자동 제거됨.
	}
}
