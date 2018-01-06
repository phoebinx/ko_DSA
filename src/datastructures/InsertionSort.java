package datastructures;

//assume you have a deck of cards and you are inserting a new card in the end, insertion sort is like 

//that where you need to compare the inserted card with all the cards before it.
//assume you have one element in the array and you are adding card in 2nd element.

public class InsertionSort {
	public static void main(String args[]) {
		int[] arr = { 66, 24, 1, 323, 454, 6577, 22 };
		sort(arr);
	}

	private static void sort(int [] arr) {
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j-1;
			while ( i >= 0 && key < arr[i]) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
		System.out.println("Sorted Array:");
		for (int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
