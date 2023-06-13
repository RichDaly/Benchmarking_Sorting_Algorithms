# Project Requirements

For this project you will write an application to benchmark five sorting algorithms. You will also write a report which introduces the algorithms, and discusses the results of the benchmarking.
The five sorting algorithms must be chosen according to the following criteria:
1. Bubble Sort
2. Selection Sort
3. Insertion Sort
4. An efficient comparison-based sort (Merge Sort, Quicksort or Heap Sort)
5. A non-comparison sort (Counting Sort, Bucket Sort or Radix Sort)

**The application** should include implementations of the five sorting algorithms, along with a main method which tests each
of them. To benchmark the algorithms, you should use arrays of randomly generated integers with different input sizes n. You
should use a variety of different input sizes, e.g. n=10, n=100, n=500,...n=10000 etc. to test the effect of the input size on
the running time of each algorithm.

The running time (in milliseconds) for each algorithm should be measured 10 times, and the average of the 10 runs for
each algorithm and each input size n should be output to the console when the program finishes executing.

**The Report**
1. **Introduction:** Introduce the concept of sorting and sorting algorithms, discuss the relevance of concepts such
as complexity (time and space), performance, in-place sorting, stable sorting, comparator functions, comparison-based
and non-comparison-based sorts, etc. Forward reference to where such issues arise in your report.
2. **Sorting Algoritms:** Introduce each algorithm, discuss its space and time complexity, and explain
how each algorithm works using bespoke diagrams. As example input for the algorithms you MUST use the digits of
your student number i.e. if your student number is G00398809 then use 3,9,8,8,0,9 as the input for your diagrams.
3. **Implementation & Benchmarking:** This section will describe the process followed when implementing the
application, and present the results of benchmarking. Discuss how the measured performance of the algorithms differed
– were the results similar to what you would expect, given the time complexity of each chosen algorithm? In this section
you should use both a table and a graph to summarise the results obtained.

# Running the application

1. Download **src** directory.
2. Compile all Java files with the following command within src directory. `javac ie/atu/sw/*.java`
3. Run the application with the following command. `java ie.atu.sw.Runner`
4. Input sizes may be manually changed in `Runner.java` **NB:** Large input sizes will cause longer running times, especially with the likes of bubble sort.
