package sorting;


import sorting.BubbleSort;
import sorting.ISort;
import java.time.Duration;
import java.time.Instant;

public class TestSort {

    public ISort iSort;

public TestSort(ISort sortMethod){
    this.iSort = sortMethod;
}

    public void test(double[] array){

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        Instant start = Instant.now();
        iSort.sort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("It took: " + Duration.between(start, Instant.now()).toNanos() + " nanoseconds.");
    }
}
