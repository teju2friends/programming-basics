package com.pulsethought.learn.algirithems;

public class ArrayUtility {
    static void swap(int[] array, int startIndex, int minIndex) {
        int value = array[startIndex];
        array[startIndex] = array[minIndex];
        array[minIndex] = value;
    }

    static void printArray(int[] unsorted, String message) {
        System.out.println(message);
        for (int number : unsorted)
            System.out.println(number);
    }
}
