package sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] array = randomArray();
        double[] tempArray1 = Arrays.copyOf(array, array.length);
        double[] tempArray2 = Arrays.copyOf(array, array.length);
        double[] tempArray3 = Arrays.copyOf(array, array.length);

        TestSort bubbleSort = new TestSort(new BubbleSort());
        TestSort parallelSort = new TestSort(new ParallelSort());
        TestSort listSort = new TestSort(new ListSort());

        bubbleSort.test(tempArray1);
        parallelSort.test(tempArray2);
        listSort.test(tempArray3);
    }

    static double[] randomArray() {
        double[] tempArray = new double[1000];
        for (int i = 0; i < 1000; ++i) {
            tempArray[i] = Math.random() * 100;
        }
        return tempArray;
    }
}
