package behavior.iterator;

import java.util.Iterator;

//Iterator Pattern : 컬렉션의 구현은 노출시키지 않고 요소들에 접근할 수 있는 패턴
public class IteratorPattern {
	public static void main(String[] args) {
		GoatThread goats = new GoatThread();	//0~29(30마리)
		goats.addGoat();	//30(31마리)
		goats.addGoat();	//31(32마리)
		goats.removeGoat();	//30~31(remove => size(30마리)보다 크면 삭제)
		goats.addGoat();	//32
		goats.addGoat();	//33
		
		Iterator<Integer> goatIter = goats.createIterator();
		while(goatIter.hasNext()) {
			int key = goatIter.next();
			Goat goat = goats.GOATS.get(key);
			System.out.print(key);
			goat.sound();
		}
	}
}
