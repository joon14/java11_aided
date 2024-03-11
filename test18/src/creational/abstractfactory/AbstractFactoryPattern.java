package creational.abstractfactory;
//Abstract Factory Pattern : 추상 클래스에서 자식 추상 클래스로, 자식 추상 클래스는 구현 클래스로 상속받아 처리되게 하고, 
//							final 모드 구조적으로 객체를 생성하여 활용된다는 측면에서 추상화 공장(Abstract Factory)이라고 한다.
public class AbstractFactoryPattern {
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("전달된 환경변수가 존재하지 않습니다.");
			System.out.println("Class Name Not Found");
			System.out.println("Main Class 실행오류");
		}
		
		final Factory factory = Factory.getFactory(args[0]);
		
		Link googleLink = factory.createLink("google", "https://www.google.com");
		Link naverLink = factory.createLink("naver", "https://www.naver.com");
		Link daumLink = factory.createLink("daum", "https://www.daum.net");
		
		final Tray searchTray = factory.createTray("검색엔진");
		searchTray.add(googleLink);
		searchTray.add(naverLink);
		searchTray.add(daumLink);
		
		final Page page = factory.createPage("검색엔진 리스트", "정도준");
		page.add(searchTray);
		
		page.output();
		/*
		ListPage의 makeHTML() 메소드 내용이 출력
		*/
	}
}
