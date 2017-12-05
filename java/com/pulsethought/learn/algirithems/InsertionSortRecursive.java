package com.pulsethought.learn.algirithems;

public class InsertionSortRecursive implements ArraySorter {
    @Override
    public void sort(int[] unsortedArray) {
        insertionSort(unsortedArray, 1);
    }

    private void insertionSort(int[] inputArray, int newElementIndex) {

        if (newElementIndex >= inputArray.length)
            return;

        for (int i = newElementIndex - 1; i >= 0; i--) {

            if (inputArray[i] < inputArray[newElementIndex]) {
                ArrayUtility.insertAt(inputArray, i + 1, newElementIndex);
                break;
            }

            if (i == 0) {
                ArrayUtility.insertAt(inputArray, i, newElementIndex);
            }

        }

        insertionSort(inputArray, newElementIndex + 1);
    }
}
