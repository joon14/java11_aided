package creational.factorymethod;
//Factory Method 패턴 : 객체를 만드는 부분을 서브 클래스(Sub Class)에 위임하는 패턴
//Factory 추상화를 통하여 IDCard 클래스의 Sub Class인 IDCardFactory를 활용하여 IDCard 객체를 생성한다.
//부모 추상 클래스(Factory)로 선언하고, 생성은 서브 클래스의 생성자(IDCardFactory)로 생성
//신분증(IDCard)를 만드는 공장(IDCardFactory)을 활용
//추상체로 Factory 클래스, Product 클래스
public class FactoryMethodPattern {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("장인범");
		Product card2 = factory.create("강범준");
		card1.use();
		card2.use();
	}
}
