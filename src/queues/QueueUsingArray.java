package queues;

public class QueueUsingArray {
	int arr[];
	int front;
	int rear;
	int len = 10;
	public static void main(String args[]) {
		QueueUsingArray queueObj = new QueueUsingArray();
		queueObj.enqueue(4);
		queueObj.enqueue(5);
		queueObj.printQueue();
		
	}

	public QueueUsingArray() {
		arr = new int[len];
		front = -1;
		rear = 0;
	}
	
	public int size() {
		
		return (len-front+rear)%len;
	}
	
	public boolean isEmpty() {
		if (front == rear || front == -1 ) {
			return true;
		}
		return false;
	}
	
	public int front() throws RuntimeException{
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return arr[front];
	}
	
	public void enqueue(int num) {
		if (size() == len-1) {
			throw new RuntimeException("Queue is full");
		}
		arr[rear] = num;
		rear = (rear+1)%len;
	}
	
	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		int num = arr[front];
		arr[front] = (Integer) null;
		front = (front+1)%len;
		return num;
	}
	
	public void printQueue() {
		for (int i = 0; i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

