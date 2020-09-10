package com.aim.algorithm.sort;

import com.aim.algorithm.sort.impl.InsertionSort;
import org.junit.Test;

public class SortTest {

    private InsertionSort insertionSort = new InsertionSort();

    @Test
    public void insertionSort(){
        int[] input = {1,4,3,6,3,1,5,32,3};
        int[] result = insertionSort.sort(input);
    }
}
