package queues;

import java.util.Iterator;
import java.util.LinkedList;

//front is always head
//rear is always tail
//not wrapping in linked list queue implementation.
public class QueueUsingLinkedList {
	LinkedList list = new LinkedList();
	 
	public static void main(String args[]) {
		QueueUsingLinkedList queueObj = new QueueUsingLinkedList();	
		queueObj.enqueue(3);
		queueObj.printQueue();
		queueObj.enqueue(4);
		queueObj.printQueue();
		queueObj.enqueue(5);
		queueObj.printQueue();
		queueObj.enqueue(6);
		queueObj.printQueue();
		queueObj.dequeue();
		queueObj.printQueue();
		queueObj.dequeue();
		queueObj.printQueue();
		queueObj.dequeue();
		queueObj.printQueue();
		queueObj.dequeue();
		queueObj.printQueue();

	}

	public void enqueue(int num) {
		//insetion always at the rear/tail of list
		list.add(num);
	}

	public int dequeue() throws RuntimeException{
		//deletion always from front/head
		if(list.isEmpty()){
			throw new RuntimeException("Queue is empty");
		}
		//head points to head of next
		return (int) list.removeFirst();
	}
	
	public void printQueue() {
		Iterator iterator = list.iterator();
		System.out.println();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
	}
}
