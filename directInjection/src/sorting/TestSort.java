package sorting;

import java.time.Duration;
import java.time.Instant;

/** Klasa testowa
 <p> To jest klasa testowa
 </p>
 @author Shin
 @version 1.0
 @see ISort
 */

public class TestSort {


    /**
     * @param iSort abstract class
     */

    public ISort iSort;

    /**
     * @param sortMethod class with implementation of different types of sorting methods
     */

    public TestSort(ISort sortMethod) {
        this.iSort = sortMethod;
    }

    /**
     * Method tests how much time it takes for different
     *
     * @param array array with not sorted values generated automatically
     */

    public void test(double[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        Instant start = Instant.now();
        iSort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("It took: " + Duration.between(start, Instant.now()).toNanos() + " nanoseconds.");
    }
}
