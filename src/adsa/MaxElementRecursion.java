package adsa;

public class MaxElementRecursion {
	public static void main(String args[]) {
		int input[] = {0};
		int output = getMaxElementFor(input);
		System.out.println("Result: " + output);
	}
	
	public static int getMaxElementFor(int arr[]) {
		if(arr.length == 0) throw new RuntimeException("Needs to have at least one element");
		return getMaxHelper(Integer.MIN_VALUE, arr, 0);
	}
	
	public static int getMaxHelper(int testVal, int arr[], int arrPointer) {
		if(arr.length <= arrPointer) return testVal;
		else {
			int nextVal = comparator(testVal, arr, arrPointer);
			return getMaxHelper(nextVal, arr, arrPointer + 1);
		}
	}
	
	private static int comparator(int testVal, int arr[], int arrPointer) {
		if (testVal > arr[arrPointer]) return testVal; else return arr[arrPointer];
	}
	
}
