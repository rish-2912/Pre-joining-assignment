package basics;

import java.util.Arrays;

public class ArraysAndOperations {
	static class Operations {
		static void sortArray(int[] arr) {
			Arrays.sort(arr);
		}

		static void printArray(int[] arr) {
			for (int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}

		static void fillArray(int[] arr, int x) {
			Arrays.fill(arr, x);
		}
	}

	public static void main(String[] args) {
		// An array is a collection of elements of same types and in java it is an
		// object. Taking an example of integer array
		int[] arr = { 10, 20, 4, 3, 2 };

		System.out.print("Array before sorting: ");
		Operations.printArray(arr);

		Operations.sortArray(arr);

		System.out.print("Array after sorting: ");
		Operations.printArray(arr);

		int[] temp = new int[5];
		System.out.print("Array after filling it with some value: ");
		Operations.fillArray(temp, 100);
		Operations.printArray(temp);

	}

}
