package datastructures;

//input: n element array X of numbers.

//output:  element array A of numbers such that A[i] is average of X[0]...X[i].

public class PrefixAverages {
	public static void main(String args[]) {
		int[] arr = { 66, 24, 1, 323, 454, 6577, 22 };
		prefixAverage(arr);
	}

	private static void prefixAverage(int[] arr) {
		int sum = 0;
		int[] avgArr = new int[arr.length];
		System.out.println("Prefix average array: ");
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			avgArr[i] = sum / (i + 1);
			System.out.print(avgArr[i] + " ");
		}
	}
}
