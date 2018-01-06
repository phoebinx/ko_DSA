package datastructures;

//Wap to print max element of an array of natural numbers

public class MaxElementArr {
	public static void main(String args[]) {
		int[] arr = { 66, 24, 1, 323, 454, 6577, 22 };
		int max = maxElement(arr);
		if (max == -1) {
			System.out.println("invalid array");
		} else {
			System.out.println("Max Elemet is " + max);
		}
	}

	private static int maxElement(int[] arr) {
		int length = arr.length;
		if (length > 0) {
			int max = arr[0];
			for (int i = 1; i < length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
			return max;
		} else {
			return -1;
		}
	}

}
