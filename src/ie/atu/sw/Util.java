package ie.atu.sw;

/**
 * A utility class that helps the benchmarking process by providing useful
 * methods to assist all other classes in the application.
 * 
 * @author Richard Daly
 * @since Java 19.
 */

public class Util {

	/**
	 * Generates an int array filled with random numbers between 0 and 100. The size
	 * of the array is set by the size parameter.
	 * 
	 * @param size The size of the array to be generated.
	 * @return The int array of the desired size with randomly generated numbers.
	 */
	public static int[] generateIntArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		return arr;
	}

	/**
	 * Creates a new array and copies all values from the input array to the new
	 * array.
	 * 
	 * @param arr The int array that is to be copied.
	 * @return A new array with the values of the input array copied.
	 */
	public static int[] copyIntArray(int[] arr) {
		int[] copy = new int[arr.length];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}

}
