package sec1;

public class GenericExam {
	public static void main(String[] args) {
		//생성자에 대한 제네릭의 타입 생략 가능 - 자바 1.7 이상
		Generic1<Student> s = new Generic1<>();
		Student a = new Student("Jung", 27);
		s.setField1(a);
		
		Generic1<Teacher> t = new Generic1<>();
		Teacher b = new Teacher("Kim", 43);
		t.setField1(b);
		
		Generic1<Integer> i = new Generic1<>();	//<기본타입은 안됨!>
		i.setField1(1004);
		
		Generic1<String> str = new Generic1<>();
		str.setField1("jdj");
	}
}
