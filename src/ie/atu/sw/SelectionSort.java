package ie.atu.sw;

/**
 * A concrete implementation of <code>SortingAlgorithm.java<code> interface
 * using the selection sort algorithm.
 * 
 * @author Richard Daly
 * @since Java 19
 */

public class SelectionSort implements SortingAlgorithm {

	/**
	 * {@inheritDoc} Selection Sort is implemented within this method.
	 * Implementation was taken from https://www.geeksforgeeks.org/selection-sort/
	 * and https://www.javatpoint.com/selection-sort-in-java
	 */
	@Override
	public void sort(int[] arr) {
		// outer loop on the array, ends on second last index
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i; // variable to compare with rest of array.

			// inner loop starting one index ahead of outer loop to end of array.
			for (int j = i + 1; j < arr.length; j++) {
				// if any any element is smaller make it the index.
				if (arr[j] < arr[index]) {
					index = j;
				}
			}

			int temp = arr[index]; // variable for inversion.
			arr[index] = arr[i]; // move starting element to index of smallest number.
			arr[i] = temp; // move smallest element to starting point.
		}
	}

}
