package com.pulsethought.learn.algirithems;

public class InsertionSortRecursive implements ArraySorter {
    @Override
    public void sort(int[] unsortedArray) {
        insertionSort(unsortedArray, 1);
    }

    private void insertionSort(int[] unsortedArray, int newElementIndex) {

        if (newElementIndex >= unsortedArray.length)
            return;

        for (int i = newElementIndex - 1; i >= 0; i--) {
            if (unsortedArray[i] < unsortedArray[newElementIndex]) {
                ArrayUtility.swap(unsortedArray, i + 1, newElementIndex);
                break;
            }
        }

        insertionSort(unsortedArray, newElementIndex + 1);
    }
}
