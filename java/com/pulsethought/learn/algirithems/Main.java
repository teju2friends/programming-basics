package com.pulsethought.learn.algirithems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        int[] unsorted = new int[]{9, 7, 6, 15, 16, 5, 10, 11};
        int[] expected = new int[]{5, 6, 7, 9, 10, 11, 15, 16};

        List<ArraySorter> sorters = new ArrayList<>();
        sorters.add(new SelectionSort());
        sorters.add(new InsertionSort());
        sorters.add(new InsertionSortRecursive());
        sorters.add(new HeapSort());

        for (ArraySorter sorter: sorters) {
            int[] unsortedArray = Arrays.copyOf(unsorted, unsorted.length);
            sorter.sort(unsortedArray);

            if (!Arrays.equals(expected, unsortedArray)) {
                ArrayUtility.printArray(unsorted, "Failed to sort using " + sorter.getClass().getSimpleName());
            } else {
                System.out.println("==>" + sorter.getClass().getSimpleName());
            }

        }

    }
}
