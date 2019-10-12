package pw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Points {

    private Scanner scanner;
    private int kolokwium1;
    private int kolokwium2;
    private int exam;

    public Points(String path) throws FileNotFoundException {
        scanner = new Scanner(new File(path));
        scanner.useDelimiter(",\\s*");
    }

    public void printPoints(){

        while(scanner.hasNextInt()){
            System.out.println(scanner.next());

        }

    }





}
