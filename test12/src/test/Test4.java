package test;

class Person {
	private String name;
	
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}

public class Test4 {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];	//Person[] pArr = null; 과 같은 문장
		/*
		for(int i=0; i<pArr.length; i++) {
			pArr[i] = new Person("kim"+i);
		}
		*/
		//해결2 : 비어 있거나 초기화되어 있지 않은 pArr 배열에 Person 객체를 생성하여 각 요소에 생성된 객체를 대입
		pArr[0] = new Person("김응원");
		pArr[1] = new Person("정도준");
		pArr[2] = new Person("조우진");
		
		for(int i=0; i<pArr.length; i++) {	//해결1	
		//for(int i=0; i<=pArr.length; i++) {	//오류1 : 실제 선언한 배열의 개수보다 더 많은 수의 반복 실행이 된다.(요청한 횟수가 배열 수 보다 더 크다.) => ArrayIndexOutOfBoundsException 발생
			System.out.println(pArr[i].getName());	//오류2 : Person의 배열요소인 pArr 객체가 초기화(값이 대입)되어 있지 않음 => NullPointerException이 발생
		}
	}
}
