package ie.atu.sw;

/**
 * A concrete implementation of <code>SortingAlgorithm.java<code> interface
 * using the counting sort algorithm.
 * 
 * @author Richard Daly
 * @since Java 19
 */

public class CountingSort implements SortingAlgorithm {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void sort(int[] arr) {
		countSort(arr, arr.length);

	}
	//

	/*
	 * Counting Sort is implemented within this method. Implementation was taken
	 * from https://www.programiz.com/dsa/counting-sort.
	 */
	private void countSort(int array[], int size) {
		int[] output = new int[size + 1];

		// Find the largest element of the array
		int max = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > max)
				max = array[i]; // set new max
		}
		// new array for histogram of occurrences. Plus one to account for index
		// starting from 0
		int[] count = new int[max + 1];

		// Initialize count array with all zeros.
		for (int i = 0; i < max; ++i) {
			count[i] = 0;
		}

		// Store the count of each element
		for (int i = 0; i < size; i++) {
			count[array[i]]++;
		}

		// Store the cummulative count of each array
		for (int i = 1; i <= max; i++) {
			count[i] += count[i - 1]; // sum of index plus previous index.
		}

		// Find the index of each element of the original array in count array, and
		// place the elements in output array
		for (int i = size - 1; i >= 0; i--) {
			output[count[array[i]] - 1] = array[i];
			count[array[i]]--;
		}

		// Copy the sorted elements into original array
		for (int i = 0; i < size; i++) {
			array[i] = output[i];
		}
	}

}
