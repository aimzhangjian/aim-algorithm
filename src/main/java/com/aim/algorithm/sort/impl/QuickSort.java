package com.aim.algorithm.sort.impl;

import com.aim.algorithm.sort.Sort;

public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] input) {
        quickSort(input, 0, input.length - 1);
        return input;
    }

    private void quickSort(int[] input, int start, int end){
        if(start < end){
            int q = randomPartition(input, start, end);
            quickSort(input, start, q - 1);
            quickSort(input, q + 1, end);
        }
    }

    private int randomPartition(int[] input, int start, int end){
        int i = (int) (Math.random() * (end - start) + start);

        int changEnd = input[end];
        input[end] = input[i];
        input[i] = changEnd;
        return partition(input, start, end);
    }

    private int partition(int[] input, int start, int end) {
        int x = input[end];
        int i = start - 1;
        for(int j = start; j < end; j++){
            if(input[j] < x){
                ++i;
                int changValueI = input[i];
                input[i] = input[j];
                input[j] = changValueI;
            }
        }
        int changEnd = input[end];
        input[end] = input[i + 1];
        input[i + 1] = changEnd;
        return i + 1;
    }
}
