package stacks;

import java.util.Scanner;

public class StackOperations {
	
	private int[] stack;
	private int top = -1;
	private int initialCapacity = 1024;
	private int capacity;
	
	public static void main(String args[]) {
	StackOperations obj = new StackOperations();
	obj.checkForInput();
	}
	
	private void checkForInput() {
		System.out.println("Choose Operation");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Print");
		System.out.println("4.Exit");
		Scanner scanner = new Scanner(System.in);
		int opt = scanner.nextInt();
		if (opt == 1) {
			System.out.println("Enter element to Push");
			this.push(scanner.nextInt());
		} else if (opt == 2) {
			this.pop();
		} else if (opt == 3) {
			this.printStack();
		} else if (opt == 4) {
			return;
		} else {
			System.out.println("Wrong choice, choose again");
			checkForInput();
		}
	}
	
	public StackOperations() {
		capacity = initialCapacity;
		stack = new int[initialCapacity];
	}
	
	public StackOperations(int capacity) {
		stack = new int[capacity];
	}
	
	private void push (int item) {
		if (this.size() == capacity) {
			System.out.println("Stack full, pop first");
			checkForInput();
		} else {
			stack[++top] = item;
			checkForInput();
		}
	}
	
	private void pop () {
		if (isEmpty()) {
			System.out.println("Stack empty, push first");
			checkForInput();
		} else {
			System.out.println("poped element : "+stack[top]);
			top--;
			checkForInput();
		};
	}
	
	private Boolean isEmpty() {
		return (top<0);
	}
	
	private int size() {
		return top+1;
	}
	
	private void printStack() {
		for (int i = 0; i<stack.length;i++) {
			System.out.print(stack[i]+" ");
		}
		checkForInput();
	}
}
