package ie.atu.sw;

/**
 * This interface is intended for use with BenchMarking.java in a Strategy
 * Design Pattern. It has a default method for timing the average runtime of
 * algorithms that in turn calls the sorting algorithm. The results will depend
 * on the class that implements the sort method and the sorting algorithm used.
 * 
 * @author Richard Daly
 * @since Java 19.
 */

public interface SortingAlgorithm {

	/**
	 * This default method will return the average running time of the method sort
	 * after being run ten times on copies of the array input as a parameter. It is
	 * timed in nanoseconds.
	 * 
	 * @param arr The int array that will be used by the sort method.
	 * @return The average runtime in nanoseconds.
	 * @see #sort(int[])
	 */
	default long timeSort(int[] arr) {
		long startTime = System.nanoTime();
		for (int i = 1; i <= 10; i++) {
			sort(Util.copyIntArray(arr));
		}
		long runtime = (System.nanoTime() - startTime) / 10; // divide by 10 for average
		return runtime;
	}

	/**
	 * Sorts an int array. Any class that implements SortingAlgorithm.java must
	 * implement this method with the desired Sorting Algorithm. This is used by the
	 * default method timeSort and must be implemented for correct usage to be
	 * ensured.
	 * 
	 * @param arr The int array that is be sorted.
	 * @see #timeSort(int[])
	 */
	public void sort(int[] arr);
}
