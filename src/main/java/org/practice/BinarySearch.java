package org.practice;

import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static Boolean binarySearch(String word, List<String> collection){

        int i = collection.size() / 2 - 1;
        while (i > 0) {
            if (collection.get(i).equals(word)){
                return true;
            } else {

            }
        }
        return false;
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // Record start time

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        //collection to search
        List<String> struct = MyData.TEST_LIST;

        // implement quick search
        System.out.println(binarySearch(word, struct));

        long endTime = System.currentTimeMillis(); // Record end time

        long duration = endTime - startTime; // Calculate elapsed time
        System.out.println("Execution time: " + duration + " milliseconds");
    }
}
