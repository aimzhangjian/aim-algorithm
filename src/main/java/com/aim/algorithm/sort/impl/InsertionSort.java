package com.aim.algorithm.sort.impl;

import com.aim.algorithm.sort.Sort;
import org.springframework.stereotype.Component;

@Component
public class InsertionSort implements Sort {

    @Override
    public Integer[] sort(Integer[] input) {
        int key;
        int i;
        for(int j = 1; j < input.length; j++){
            key = input[j];
            i = j - 1;
            while (i >=0 && input[i] > key){
                input[i + 1] = input[i];
                i--;
            }
            input[i + 1] = key;
        }
        return input;
    }
}
