package pw;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        try {
            Points points = new Points("SkannerExcercise/src/resources/evaluations.txt");
            points.printPoints();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
