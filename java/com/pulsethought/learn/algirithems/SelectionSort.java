package com.pulsethought.learn.algirithems;

public class SelectionSort implements ArraySorter {
    public void sort(int[] array) {
        int minIndex;

        for (int startIndex = 0; startIndex < array.length; startIndex++) {
            minIndex = startIndex;
            for (int pointer = startIndex; pointer < array.length; pointer++) {
                if (array[pointer] < array[minIndex]) {
                    minIndex = pointer;
                }
            }
            ArrayUtility.swap(array, startIndex, minIndex);
        }
    }

}
