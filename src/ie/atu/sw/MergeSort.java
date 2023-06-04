package ie.atu.sw;

/**
 * A concrete implementation of <code>SortingAlgorithm.java<code> interface
 * using the merge sort algorithm.
 * 
 * @author Richard Daly
 * @since Java 19
 */

public class MergeSort implements SortingAlgorithm {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void sort(int[] arr) {
		mergeSort(arr, arr.length);

	}

	/*
	 * Merge Sort is implemented within the following methods. Implementation was
	 * taken from https://www.javatpoint.com/merge-sort. Some parts have been
	 * renamed for personal understanding.
	 */
	private void mergeSort(int[] arr, int arrLength) {
		// base case, if less than two return.
		if (arrLength < 2) {
			return;
		}
		int middle = arrLength / 2;
		// split original into two
		int[] arr1 = new int[middle];
		int[] arr2 = new int[arrLength - middle];

		// copy all elements left of the middle.
		for (int i = 0; i < middle; i++) {
			arr1[i] = arr[i];
		}
		// copy all elements right of the middle.
		for (int i = middle; i < arrLength; i++) {
			arr2[i - middle] = arr[i];
		}

		mergeSort(arr1, middle); // recursive call on first array
		mergeSort(arr2, arrLength - middle); // recursive call on second array

		merge(arr, arr1, arr2, middle, arrLength - middle);
	}

	private void merge(int[] arr, int[] arr1, int[] arr2, int left, int right) {

		int i = 0; // original arr counter
		int j = 0; // arr1 counter
		int k = 0; // arr2 counter

		// copy new arrays into the original array.
		while (j < left && k < right) {
			if (arr1[j] <= arr2[k]) {
				arr[i++] = arr1[j++];
			} else {
				arr[i++] = arr2[k++];
			}
		}

		// Once one array has been full copied, flush the remaining array.

		// flush arr1
		while (j < left) {
			arr[i++] = arr1[j++];
		}
		// flush arr2
		while (k < right) {
			arr[i++] = arr2[k++];
		}
	}

}
