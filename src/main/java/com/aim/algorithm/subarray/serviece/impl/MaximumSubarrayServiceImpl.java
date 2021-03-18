package com.aim.algorithm.subarray.serviece.impl;

import com.aim.algorithm.subarray.entity.MaximumSubarray;
import com.aim.algorithm.subarray.serviece.MaximumSubarrayService;

public class MaximumSubarrayServiceImpl implements MaximumSubarrayService {
    public MaximumSubarray findMaximumSubarray(int[] input) {
        return findMaximumSubarray(input, 0, input.length - 1);
    }

    public MaximumSubarray findMaximumSubarray(int[] input, int low, int high) {
        if (high == low) {
            return new MaximumSubarray(low, high, input[low]);
        } else {
            int mid = Math.floorDiv(low + high, 2);
            MaximumSubarray leftMaximumSubarray = findMaximumSubarray(input, low, mid);
            MaximumSubarray rightMaximumSubarray = findMaximumSubarray(input, mid + 1, high);
            MaximumSubarray crossMaximumSubarray = findMaxCrossingSubarray(input, low, mid, high);
            if (leftMaximumSubarray.getSum() > rightMaximumSubarray.getSum()
                    && leftMaximumSubarray.getSum() > crossMaximumSubarray.getSum()) {
                return leftMaximumSubarray;
            } else if (rightMaximumSubarray.getSum() > leftMaximumSubarray.getSum()
                    && rightMaximumSubarray.getSum() > crossMaximumSubarray.getSum()) {
                return rightMaximumSubarray;
            } else {
                return crossMaximumSubarray;
            }
        }
    }

    private MaximumSubarray findMaxCrossingSubarray(int[] input, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxLeft = -1;
        for (int i = mid; i >= low; i--) {
            sum += input[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        int maxRight = -1;
        sum = 0;
        for (int j = mid + 1; j <= high; j++) {
            sum += input[j];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = j;
            }
        }
        return new MaximumSubarray(maxLeft, maxRight, leftSum + rightSum);
    }
}
