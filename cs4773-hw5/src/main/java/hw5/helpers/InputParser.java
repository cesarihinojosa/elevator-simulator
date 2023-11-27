package hw5.helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputParser {

    public static ArrayList<Integer> parseFile(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            ArrayList<Integer> intList = new ArrayList<Integer>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numberStrings = line.split(" ");
                for (int i = 0; i < numberStrings.length; i++) {
                    intList.add(Integer.parseInt(numberStrings[i]));
                }
            }

            scanner.close();
            return intList;
        } catch (FileNotFoundException e) {
            return new ArrayList<Integer>(); // Return an empty array or handle the error accordingly
        }
    }

}
