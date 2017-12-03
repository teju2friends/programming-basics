package com.pulsethought.learn.algirithems;


public class SelectionSort {

    public static void main(String args[]) {
        int[] unsorted = new int[]{11, 25, 12, 22, 64};
        printArray(unsorted, "Unsorted List");
        selectionSort(unsorted);
        printArray(unsorted, "Sorted List");
    }

    private static void selectionSort(int[] array) {
        int minIndex;

        for (int startIndex = 0; startIndex < array.length; startIndex++) {
            minIndex = startIndex;
            for (int pointer = startIndex; pointer < array.length; pointer++) {
                if (array[pointer] < array[minIndex]) {
                    minIndex = pointer;
                }
            }
            swap(array, startIndex, minIndex);
        }
    }

    private static void swap(int[] array, int startIndex, int minIndex) {
        int value = array[startIndex];
        array[startIndex] = array[minIndex];
        array[minIndex] = value;
    }

    private static void printArray(int[] unsorted, String message) {
        System.out.println(message);
        for (int number : unsorted)
            System.out.println(number);
    }
}
