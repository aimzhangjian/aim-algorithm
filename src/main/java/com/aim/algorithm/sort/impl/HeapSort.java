package com.aim.algorithm.sort.impl;

import com.aim.algorithm.sort.Sort;

public class HeapSort implements Sort {
    @Override
    public Integer[] sort(Integer[] input) {
        return heapSort(input);
    }

    public void maxHeapify(Integer[] input, int heapSize, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;
        if (l < heapSize && input[l] > input[i]) {
            largest = l;
        }
        if (r < heapSize && input[r] > input[largest]) {
            largest = r;
        }
        if (largest != i) {
            input[i] = input[i] ^ input[largest];
            input[largest] = input[i] ^ input[largest];
            input[i] = input[i] ^ input[largest];
            maxHeapify(input, heapSize, largest);
        }
    }


    public void buildMaxHeap(Integer[] input) {
        for (int i = input.length / 2 - 1; i >= 0; i--) {
            maxHeapify(input, input.length, i);
        }
    }

    public Integer[] heapSort(Integer[] input) {
        int heapSize = input.length;
        buildMaxHeap(input);
        for (int i = input.length - 1; i >= 1; i--) {
            input[0] = input[0] ^ input[i];
            input[i] = input[0] ^ input[i];
            input[0] = input[0] ^ input[i];
            heapSize--;
            maxHeapify(input, heapSize, 0);
        }
        return input;
    }
}
