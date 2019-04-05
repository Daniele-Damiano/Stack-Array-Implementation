package org.stackArrayImplementation;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		boolean f = stack.isEmpty();
		System.out.println("La pila e vuota = "+f);
		
		stack.Push(5);
		stack.Push(10);
		stack.Push(13);
		stack.Push(4);
		stack.Push(9);
		stack.Push(1);
		stack.Push(3); //Causa raddoppio array
		System.out.println("Top = "+stack.Top());
		System.out.println("Pop = "+stack.Pop());
		System.out.println("Pop = "+stack.Pop());
		System.out.println("Pop = "+stack.Pop());
		System.out.println("Pop = "+stack.Pop()); // Causa ridimensionamento array
		
		System.out.println();
		
		Stack<Double> stack1 = new Stack<>();
		boolean f1 = stack1.isEmpty();
		System.out.println("La pila e vuota? = "+f1);
		
		stack1.Push(5.0);
		stack1.Push(10.0);
		stack1.Push(13.3);
		stack1.Push(4.9);
		stack1.Push(9.4);
		stack1.Push(1.6);
		stack1.Push(3.0); //Causa raddoppio array
		System.out.println("Top = "+stack1.Top());
		System.out.println("Pop = "+stack1.Pop());
		System.out.println("Pop = "+stack1.Pop());
		System.out.println("Pop = "+stack1.Pop());
		System.out.println("Pop = "+stack1.Pop()); // Causa ridimensionamento array
		
		System.out.println();
		
		Stack<String> stack2 = new Stack<>();
		boolean f2 = stack1.isEmpty();
		System.out.println("La pila e vuota? = "+f2);
		
		stack2.Push("Daniele");
		stack2.Push("Pippo");
		stack2.Push("Baudo");
		stack2.Push("Pluto");
		stack2.Push("Tastiera");
		stack2.Push("Mouse");
		stack2.Push("Computer"); //Causa raddoppio array
		System.out.println("Top = "+stack2.Top());
		System.out.println("Pop = "+stack2.Pop());
		System.out.println("Pop = "+stack2.Pop());
		System.out.println("Pop = "+stack2.Pop());
		System.out.println("Pop = "+stack2.Pop()); // Causa ridimensionamento array
		
	}
		

}
