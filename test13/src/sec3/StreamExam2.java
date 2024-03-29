package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//String 타입의 List Stream 방식 활용
//stream.메소드();
public class StreamExam2 {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("Jung");
		lst.add("Cho");
		lst.add("Kim");
		lst.add("Lee");
		lst.add("Han");
		lst.add("Park");
		lst.add("Kang");
		
		//ArrayList의 stream화
		Stream<String> stream = lst.stream();
		System.out.print("정렬 전 : ");
		stream.forEach(s -> System.out.print(s+"\t"));
		
		System.out.println();
		
		System.out.print("정렬 후 : ");
		lst.stream().sorted().forEach(s -> System.out.print(s+"\t"));
		int cnt = (int) lst.stream().count();
		
		System.out.println();
		
		System.out.println("인원 수 : "+cnt);
	}
}
