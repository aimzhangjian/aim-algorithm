package com.aim.algorithm.sort.impl;

import com.aim.algorithm.sort.Sort;
import org.springframework.stereotype.Service;

@Service
public class MergeSort implements Sort {
    @Override
    public int[] sort(int[] input) {
        mergeSort(input, 0, input.length-1);
        return input;
    }

    public void mergeSort(int[] input, int start, int end){
        if(start < end){
            int mid = (int) Math.floor(((double) start + end)/2);
            mergeSort(input, start, mid);
            mergeSort(input, mid + 1, end);
            merge(input, start, mid, end);
        }
    }

    private void merge(int[] input, int start, int mid, int end){
        int l = mid - start + 1;
        int r = end - mid;
        int[] left = new int[l + 1];
        int[] right = new int[r + 1];
        for(int i = 0; i < l; i++){
            left[i] = input[start + i];
        }
        for(int j = 0; j < r; j++){
            right[j] = input[mid + j + 1];
        }
        left[l] = Integer.MAX_VALUE;
        right[r] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for(int k = start; k <= end; k++){
            if(left[i] <= right[j]){
                input[k] = left[i];
                i++;
            }else {
                input[k] = right[j];
                j++;
            }
        }
    }
}
