package ie.atu.sw;

/**
 * A concrete implementation of <code>SortingAlgorithm.java<code> interface
 * using the insertion sort algorithm.
 * 
 * @author Richard Daly
 * @since Java 19
 */

public class InsertionSort implements SortingAlgorithm {

	/**
	 * {@inheritDoc} Insertion Sort is implemented within this method.
	 * Implementation was taken from https://www.geeksforgeeks.org/insertion-sort/
	 * and https://www.javatpoint.com/insertion-sort-in-java
	 */
	@Override
	public void sort(int[] arr) {
		int n = arr.length; // length of array

		// loop over the array.
		for (int i = 1; i < n; i++) {
			int key = arr[i]; // element for comparison
			int j = i - 1; // index j starting one index behind i

			// if index j is greater than key move back through array inverting elements
			// until correct position found.
			while ((j > -1) && (arr[j] > key)) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key; // put key into correct place
		}
	}

}
