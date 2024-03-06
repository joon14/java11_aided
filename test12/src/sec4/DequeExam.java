package sec4;

import java.util.Deque;
import java.util.LinkedList;

//Deque : LIFO와 FIFO가 모두 가능한 구조 
//-> 스택과 큐의 혼합 구조로써 양쪽에서 입력과 출력이 모두 가능한 구조
public class DequeExam {
	public static void main(String[] args) {
		Deque<String> d = new LinkedList<>();
		
		//추가
		d.addFirst("java");
		d.addFirst("python");
		d.addLast("javascript");
		d.addFirst("react");
		d.addLast("node");
		d.addLast("stylesheet");
		
		System.out.println(d);
		
		System.out.println(d.peek());		//Queue 처럼 동작
		System.out.println(d.peekLast());	//Stack 처럼 동작
		System.out.println(d.peekFirst());	//Queue 처럼 동작
		
		System.out.println();
		
		System.out.println(d.poll());		//Queue 처럼 동작하여 맨 처음 요소 반환 후 제거
		System.out.println(d.pollLast());	//제어점이 맨 마지막
		System.out.println(d.pollFirst());	//제어점이 맨 처음
		
		System.out.println(d);
		
		System.out.println();
		
		System.out.println(d.pop());		//맨 처음 요소 반환 후 제거
		System.out.println(d);
	}
}
