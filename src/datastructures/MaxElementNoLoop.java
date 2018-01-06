package datastructures;

public class MaxElementNoLoop {

	public static void main(String args[]) {
		int[] arr = { -1,-2,-3,-4,-5,0 };
		if(arr.length>0) {
			int max = maxElement(arr, 0);
			System.out.println("Max Element of Array is " + max);
		} else {
			System.out.println("Invalid array");
		}
	}

	private static int maxElement(int[] arr, int i) {
		int max = arr[i];
		if (i == arr.length - 1) {
			return max;
		} else {
			int preMax = maxElement(arr, i + 1);
			if (preMax > max) {
				return preMax;
			} else {
				return max;
			}
		}
	}

}
