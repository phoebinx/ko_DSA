package stacks;

import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> stackQueue;
	int index = 0;

	public static void main(String args[]) {
		QueueUsingStack obj = new QueueUsingStack();
		obj.enqueue(0);
		System.out.println(obj.dequeue());
		obj.enqueue(2);
		System.out.println(obj.dequeue());
		obj.enqueue(4);
		obj.enqueue(8);
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		obj.enqueue(3);
		obj.enqueue(5);
		obj.enqueue(9);
		System.out.println(obj.dequeue());
		obj.enqueue(11);
		obj.enqueue(14);
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		
		}

	public QueueUsingStack() {
		stackQueue = new Stack<Integer>();
	}

	private void enqueue(int element) {
		stackQueue.push(element);
	}

	private int dequeue() throws RuntimeException {
		if (stackQueue.isEmpty()) {
			throw new RuntimeException("Queue is empty, can't dequeue");
		}
		return removeRecursively();
	}

	private int removeRecursively() {
		if (stackQueue.isEmpty()) {
			return 0;
		} else {
			int element = stackQueue.pop();
			int prevElement = removeRecursively();
			if (prevElement==0) {
				return element;
			} else {
				stackQueue.push(element);
				return prevElement;
			}
		}

	}

}
