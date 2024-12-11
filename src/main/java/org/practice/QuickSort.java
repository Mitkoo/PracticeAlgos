package org.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static List<Integer> quickSort(List<Integer> collectionToSort){

        for (int n = 0; n < collectionToSort.size(); n++) {
            for (int i = n+1; i < collectionToSort.size(); i++) {
                if (collectionToSort.get(n) > collectionToSort.get(i)){
                    int temp = collectionToSort.get(i);
                    collectionToSort.set(i, collectionToSort.get(n));
                    collectionToSort.set(n, temp);
                }
            }
        }
        return collectionToSort;
    }
    public static void main(String[] args) {

        List<Integer> struct = new ArrayList<>(Arrays.asList(4,6,8,3,2,1,7,8,4,3));
        List<Integer> ordered = quickSort(struct);

        ordered.forEach(System.out::println);
    }
}
