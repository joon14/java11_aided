package sec1;

public class StudentExam1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student();
		Student s2 = new Student();
		s2 = s1;	//얕은 복사
		Student s3 = (Student) s1.clone();
		
		System.out.println(s1.getClass().toString());	//해당 인스턴스의 클래스 이름 출력
		System.out.println(s1 instanceof Student);		//s1 인스턴스가 Student 클래스로 생성된 것인지의 유무 판단
		System.out.println(s1.toString());				//현재 s1 인스턴스에 대한 stack 에 있는 heap 의 위치를 16진수로 출력
		System.out.println(s1.equals(s2));				//두 객체(인스턴스)가 같은지 비교
		System.out.println(s1.hashCode());				//해시코드
		
		//Student 클래스에 equals 를 모든 멤버 필드(변수)에 대하여 비교하는 오버라이딩을 해주면, 값 비교가 가능
		//s1값과 s3값을 비교하기 위해서는 equals 를 오버라이딩 해야함, 오버라이딩 안하면 주소값 비교
		System.out.println(s3.equals(s1));				
	}
}
