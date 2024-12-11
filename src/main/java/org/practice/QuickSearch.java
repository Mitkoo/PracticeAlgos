package org.practice;

import java.util.*;

public class QuickSearch {
    public static Boolean quickSearch (String toSearch, List<String> collection) {

        for (String string : collection) {
            if (Objects.equals(string, toSearch)){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // Record start time

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        //collection to search
        //List<String> struct = new ArrayList<>(Arrays.asList("test1", "test2", "test3", "test4","test5", "test6","test7", "test8","test9", "test10"));
        List<String> struct = MyData.TEST_LIST;

        // implement quick search
        System.out.println(quickSearch(word, struct));

        long endTime = System.currentTimeMillis(); // Record end time

        long duration = endTime - startTime; // Calculate elapsed time
        System.out.println("Execution time: " + duration + " milliseconds");
    }
}
