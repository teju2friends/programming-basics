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

    public static void insertAt(int[] array, int position, int newElementIndex) {
        int value = array[newElementIndex];
        for (int i = newElementIndex; i > position; i--) {
            array[i] = array[i - 1];
        }
        array[position] = value;
    }
}
