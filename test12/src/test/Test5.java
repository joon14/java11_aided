package test;

import java.util.ArrayList;
import java.util.List;

class Fruit {
	private String name;
	private String color;
	
	public Fruit() {}
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + "]";
	}
}

public class Test5 {
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
		//list.add(new Fruit("바나나")); 
		//오류1. list(ArrayList)의 제네릭 타입은 Fruit로 설정되어 있으므로 Fruit으로 객체를 생성하여 요소를 추가해야 하지만, 코드에서 String을 요소로 추가하였다. => Type MisMatch Error 발생
		list.add(new Fruit("바나나", "노랑"));
		
		
		//for(int i=0; i<list.length; i++) {	
		//오류2. list(ArrayList) 컬렉션 프레임워크는 length 속성이 없어 요소의 수를 구하려고 한다면 size() 메소드를 사용해야 한다. => Not Found Attribute(속성) Error 발생
		for(int i=0; i<list.size(); i++) {
			//System.out.println(list[i].getName());
			//오류3. [인덱스] 는 배열객체에서 활용해야 하지만, list(ArrayList)인 곳에 배열 요소 참조 연산인 []이 사용되었음 => Not Allowed Operation(Operation Not Permitted) Error 발생
			System.out.println(list.get(i).getName());
		}
		/*
		for(Fruit f:list) {
			System.out.println(f.toString());
		}
		*/
	}
}
