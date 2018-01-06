package stacks;

import java.util.Stack;

//Span of stock price on a certain day i is max number of consecutive days 
//(upto current day {inclusive}), the price of the stack has been less than or 
//equal to its price on day i.

public class StockSpan {

	public static void main(String args[]) {
		int arr[] = {6,2,3,4,5};
		int spanArr[] = calculateSpan(arr);
		printArray(spanArr);
		
	}
	
	private static int[] calculateSpan(int [] arr) {
		int [] spanArr = new int[arr.length];
		Stack helperStack = new Stack();
		for(int i = 0; i< arr.length; i ++) {
			boolean done = false;
			int k = 0;
			while (done != true && helperStack.isEmpty() != true) {
				if (arr[i] > arr[(int) helperStack.peek()]) {
					helperStack.pop();
				} else {
					done = true;
				}
			}
			if (helperStack.isEmpty()) {
				k = -1;
			} else {
				k = (int) helperStack.peek();
			}
			spanArr[i] = i-k; 
			helperStack.push(i);
		}
		return spanArr;
	}
	
	private static void printArray(int [] arr) throws RuntimeException {
		if (arr.length <= 0) {
			throw new RuntimeException("Empty Array");
		} else {
			for (int i =0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
