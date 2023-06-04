package ie.atu.sw;

/**
 * A concrete implementation of <code>SortingAlgorithm.java<code> interface
 * using the bubble sort algorithm.
 * 
 * @author Richard Daly
 * @since Java 19
 */

public class BubbleSort implements SortingAlgorithm {

	/**
	 * {@inheritDoc} Bubble Sort is implemented within this method. Implementation
	 * was taken from https://www.geeksforgeeks.org/bubble-sort/ and
	 * https://www.javatpoint.com/bubble-sort-in-java
	 */
	@Override
	public void sort(int[] arr) {
		int n = arr.length; // length of array

		// outer loop iteration on array. full length of array, will complete method a
		// full pass of the array has been completed.
		for (int i = 0; i < n; i++) {

			// inner loop iteration comparing elements of array, starting at index 1.
			for (int j = 1; j < n - i; j++) {

				// comparison of the index. example is index 0 less then index 1.
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1]; // temporary variable to allow inversion.
					arr[j - 1] = arr[j]; // insert the smaller element down one index.
					arr[j] = temp; // move the larger element up one index.
				}
			}
		}
	}

}
