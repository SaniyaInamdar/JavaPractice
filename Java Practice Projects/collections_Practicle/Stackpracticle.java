package collections_Practicle;

import java.util.Stack;

public class Stackpracticle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack1=new Stack<Integer>();
		stack1.add(87);
		stack1.add(78);
		stack1.add(14);
		stack1.add(8);
		stack1.add(457);
		stack1.add(889);
		stack1.add(57);
		stack1.add(75);
		stack1.add(10);
		stack1.add(70);
		stack1.add(47);
		System.out.println(stack1);
		
		System.out.println("Peek");
		Object o=stack1.peek();
		System.out.println(o);
		System.out.println(stack1);
		
		System.out.println("Push");
		Object o1=stack1.push(1);
		System.out.println(o1);
		System.out.println(stack1);
		
		System.out.println("Pop");
		Object o2=stack1.pop();
		System.out.println(o2);
		System.out.println(stack1);
		
	}

}
