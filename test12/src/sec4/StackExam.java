package sec4;

import java.util.Stack;

//Stack : 탑 같이 입력할 때는 쌓아 올려지고, 출력할 때는 반대로 맨 마지막에 입력한 값이 가장 위에 입력된다.
//LIFO(Last In First Out) - 후입선출
public class StackExam {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		//요소 추가
		stack.push("apple");
		stack.push("pineapple");
		stack.push("cherry");
		stack.push("melon");
		stack.push("strawberry");
		
		System.out.println(stack);
		
		System.out.println(stack.peek());	//맨 마지막 요소 반환
		System.out.println(stack.peek());
		System.out.println(stack.pop());	//맨 마지막 요소 반환 후 제거
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}
