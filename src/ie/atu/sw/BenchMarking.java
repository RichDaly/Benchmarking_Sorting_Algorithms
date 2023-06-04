package ie.atu.sw;

/**
 * This class is central to the entire application, it is the control center.
 * Sets up and runs the benchmarking process, all other classes are called or
 * controlled from here with the exception of Runner.java that starts the
 * application.
 * 
 * @author Richard Daly
 * @since Java 19
 */

public class BenchMarking {
	private BubbleSort bubble = new BubbleSort();
	private InsertionSort insertion = new InsertionSort();
	private SelectionSort selection = new SelectionSort();
	private MergeSort merge = new MergeSort();
	private CountingSort counting = new CountingSort();

	private int numOfAlgorithms = 5;
	private Object[][] results;
	private int[] arraySizes;

	/**
	 * Class Constructor that prepares for the bench marking to begin. Ensures that
	 * there is adequate space to store all results depending on the amount of array
	 * sizes to be tested.
	 * 
	 * @param inputArray     An int array including the different size random arrays
	 *                       to be bench marked.
	 * @param inputArraySize The length of the inputArray.
	 */
	public BenchMarking(int[] inputArray, int inputArraySize) {
		// Object[][] results increased by 1 to allow for space that below statements
		// take.
		this.results = new Object[inputArraySize + 1][numOfAlgorithms + 1];
		this.arraySizes = inputArray;
		results[0][0] = "Sizes";
		results[0][1] = "Bubble Sort";
		results[0][2] = "Selection Sort";
		results[0][3] = "Insertion Sort";
		results[0][4] = "Merge Sort";
		results[0][5] = "Counting Sort";
	}

	/**
	 * Executes the bench marking process on the data added in the parameters of the
	 * Benchmarking Constructor.
	 * 
	 * @see #BenchMarking(int[], int)
	 */
	public void startBenchmark() {
		System.out.println("[INFO] Running, please wait...\n");
		int count = 0;
		double divider = 1000000.0d; // to convert result from nanoseconds.
		for (int size : arraySizes) {
			int[] arr = Util.generateIntArray(size);

			results[count + 1][0] = arraySizes[count];
			results[count + 1][1] = (bubble.timeSort(arr)) / divider;
			results[count + 1][2] = (selection.timeSort(arr)) / divider;
			results[count + 1][3] = (insertion.timeSort(arr)) / divider;
			results[count + 1][4] = (merge.timeSort(arr)) / divider;
			results[count + 1][5] = (counting.timeSort(arr)) / divider;

			count++;
		}
		printResult();
	}

	/*
	 * Outputs the results to the console. Ensures that layout and doubles are
	 * formatted correctly.
	 */
	private void printResult() {
		// Prints first line without numbers being formatted to 3
		// decimal places.
		System.out.printf("%-16s", results[0][0]);
		for (int i = 1; i < results.length; i++) {
			System.out.printf("%-9s", results[i][0]);
		}
		System.out.print("\n");

		// Prints out remaining results with doubles formatted to 3 decimal places.
		for (int i = 1; i <= numOfAlgorithms; i++) {
			System.out.printf("%-16s", results[0][i]);
			for (int j = 1; j < results.length; j++) {
				Double time = Double.parseDouble(results[j][i].toString());
				System.out.printf("%-9.3f", time);
			}
			System.out.print("\n");
		}

		// Let the user know the benchmarking is complete.
		System.out.println("\n[INFO] Benchmarking Complete.");
	}

}
