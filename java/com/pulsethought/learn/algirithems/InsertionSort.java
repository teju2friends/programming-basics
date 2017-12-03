package com.pulsethought.learn.algirithems;

public class InsertionSort {

    public static void main(String args[]) {
        int[] unsorted = new int[]{11, 25, 12, 22, 64};
        printArray(unsorted, "Unsorted List");
        selectionSort(unsorted);
        printArray(unsorted, "Sorted List");
    }
}
