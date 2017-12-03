package com.pulsethought.learn.algirithems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        int[] unsorted = new int[]{11, 25, 12, 22, 64};
        int[] expected = new int[]{11, 12, 22, 25, 64};

        List<ArraySorter> sorters = new ArrayList<>();
        sorters.add(new SelectionSort());
        sorters.add(new InsertionSort());
        sorters.add(new InsertionSortRecursive());

        for (ArraySorter sorter : sorters) {
            int[] unsortedArray = Arrays.copyOf(unsorted, unsorted.length);
            sorter.sort(unsortedArray);

            if (!Arrays.equals(expected, unsortedArray)) {
                ArrayUtility.printArray(unsorted, "Failed to sort using " + sorter.getClass().getSimpleName());
            }

        }

    }
}
