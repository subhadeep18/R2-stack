package com.example.java;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Stack stack = new Stack();
		stack.push(1); stack.push(2);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(5);
		
		stack.traverse();
		
		stack.pop(); stack.pop();stack.pop();
		stack.pop(); stack.pop();stack.pop();
		stack.pop(); stack.pop();stack.pop();
		stack.pop(); stack.pop();
		
		stack.push(6);
		stack.traverse();*/
		
		Stack1<String> stack = new Stack1<>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		
		stack.pop();
		
		stack.push("f");
		
		stack.traverse();
	}

}
