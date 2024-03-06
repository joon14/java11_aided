package sec4;

public class ClassExam {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person p1 = new Person("Jung", 27);
		System.out.println("클래스 명 : "+p1.getClass().getName());
		
		Class<Person> p2 = Person.class;
		System.out.println("클래스 명 : "+p2.getName());
		
		Class p3 = Class.forName("sec4.Person"); //클래스를 동적로딩
		System.out.println("클래스 명 : "+p3.getName());
		
		Person p4 = (Person) p3.newInstance();
		p4.setName("Jung");
		p4.setAge(27);
		System.out.println("인스턴스 정보 : "+p4);
	}
}
