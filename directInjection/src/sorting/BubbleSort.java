package sorting;

import java.util.Arrays;

public class BubbleSort implements ISort {



    @Override
    public void sort(double[] array) {
        boolean sorted = false;
        double temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

}
