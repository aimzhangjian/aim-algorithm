package com.aim.algorithm.sort;

import com.aim.algorithm.sort.impl.HeapSort;
import com.aim.algorithm.sort.impl.InsertionSort;
import com.aim.algorithm.sort.impl.MergeSort;
import com.aim.algorithm.subarray.entity.MaximumSubarray;
import org.apache.logging.log4j.util.Strings;
import org.junit.Test;
import org.springframework.util.Assert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SortTest {

    private static InsertionSort insertionSort = new InsertionSort();

    private static MergeSort mergeSort = new MergeSort();

    private static HeapSort heapSort = new HeapSort();


    public static void main(String[] args) throws IOException {
        heapSort();
    }


    public static void insertionSort() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要排序数组");
        String arrayStr = scan.nextLine();
        while (Strings.isBlank(arrayStr)) {
            System.out.println("请输入要排序数组");
            arrayStr = scan.nextLine();
        }

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("请输入要排序数组");
        arrayStr = bufferedReader.readLine();

        String[] arrays = arrayStr.split(" ");
        int[] input = Arrays.stream(arrays).mapToInt(array -> Integer.valueOf(array)).toArray();
        int[] result = insertionSort.sort(input);
        Arrays.stream(result).forEach(rsl -> System.out.println(rsl));
    }


    public void mergeSort(){
        int[] input = {1,4,3,6,3,1,5,32};
        int[] result = mergeSort.sort(input);
        System.out.println(result);
    }

    public static void heapSort() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要排序数组");
        String arrayStr = scan.nextLine();
        while (Strings.isBlank(arrayStr)) {
            System.out.println("请输入要排序数组");
            arrayStr = scan.nextLine();
        }
        String[] arrays = arrayStr.split(" ");
        int[] input = Arrays.stream(arrays).mapToInt(array -> Integer.valueOf(array)).toArray();

        int[] result = heapSort.sort(input);
        Arrays.stream(result).forEach(rsl -> System.out.println(rsl));
    }
}
