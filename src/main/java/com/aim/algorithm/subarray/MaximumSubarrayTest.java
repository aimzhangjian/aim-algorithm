package com.aim.algorithm.subarray;

import com.aim.algorithm.subarray.entity.MaximumSubarray;
import com.aim.algorithm.subarray.serviece.MaximumSubarrayService;
import com.aim.algorithm.subarray.serviece.impl.MaximumSubarrayServiceImpl;
import org.apache.logging.log4j.util.Strings;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubarrayTest {

    private static MaximumSubarrayService maximumSubarrayService = new MaximumSubarrayServiceImpl();

    public static void main(String[] args) throws IOException {
        findMaximumSubarray();
    }

    public static void findMaximumSubarray() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要排序数组");
        String arrayStr = scan.nextLine();
        while (Strings.isBlank(arrayStr)) {
            System.out.println("请输入要排序数组");
            arrayStr = scan.nextLine();
        }
        String[] arrays = arrayStr.split(" ");
        int[] input = Arrays.stream(arrays).mapToInt(array -> Integer.valueOf(array)).toArray();

        MaximumSubarray maximumSubarray =  maximumSubarrayService.findMaximumSubarray(input);
        System.out.println(maximumSubarray.toString());
    }
}
