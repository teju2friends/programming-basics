package com.pulsethought.learn.algirithems;

public class InsertionSort implements ArraySorter {

    @Override
    public void sort(int[] unsortedArray) {

        if (unsortedArray.length < 1)
            return;

        for (int newElementIndex = 1; newElementIndex < unsortedArray.length; newElementIndex++) {

            for (int i = newElementIndex - 1; i >= 0; i--) {

                if (unsortedArray[i] < unsortedArray[newElementIndex]) {
                    ArrayUtility.insertAt(unsortedArray, i + 1, newElementIndex);
                    break;
                }

                if (i == 0) {
                    ArrayUtility.insertAt(unsortedArray, i, newElementIndex);
                }

            }

        }

    }
}
