package ie.atu.sw;

/**
 * Runner class contains the main method for the application.
 * 
 * @author Richard Daly
 * @since Java 19
 */

public class Runner {

	/**
	 * Main method to start the bench marking application with decided values.
	 * Custom test could be run by creating a new array of test size values and
	 * passing them to the application in the fashion.
	 * 
	 * @param args none taken
	 */
	public static void main(String[] args) {

		int[] arraySizes = { 100, 1000, 2000, 4000, 5000, 6000, 7000, 8000, 9000, 10000 };
		BenchMarking b = new BenchMarking(arraySizes, arraySizes.length);
		b.startBenchmark();
	}
}
