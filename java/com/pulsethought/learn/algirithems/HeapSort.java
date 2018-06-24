package com.pulsethought.learn.algirithems;

public class HeapSort implements ArraySorter {
    private static void heapify(int[] array, int rootIndex, int arrayLength) {
        int leftChildIndex = (rootIndex * 2) + 1;
        int rightChildIndex = (rootIndex * 2) + 2;

        int maxIndex = rootIndex;
        if (leftChildIndex < arrayLength && array[leftChildIndex] > array[rootIndex]) {
            maxIndex = leftChildIndex;
        }

        if (rightChildIndex < arrayLength && array[rightChildIndex] > array[maxIndex]) {
            maxIndex = rightChildIndex;
        }

        if (rootIndex != maxIndex) {
            ArrayUtility.swap(array, rootIndex, maxIndex);
            heapify(array, maxIndex, arrayLength);
        }

    }

    @Override
    public void sort(int[] unsortedArray) {
        createHeap(unsortedArray, unsortedArray.length);

        int sizeOfHeap = unsortedArray.length;

        for (int i = sizeOfHeap - 1; i >= 0; i--) {
            ArrayUtility.swap(unsortedArray, 0, i);
            createHeap(unsortedArray, --sizeOfHeap);
        }
    }

    public void createHeap(int[] heapArray, int length) {
        for (int i = (length / 2) - 1; i >= 0; i--) {
            heapify(heapArray, i, length);
        }
    }
}

