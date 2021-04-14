package com.aim.algorithm.subarray.entity;

public class MaximumSubarray {
    private int startIndex;
    private int endIndex;
    private int sum;

    public MaximumSubarray(){}

    public MaximumSubarray(int low, int high, int sum) {
        this.startIndex = low;
        this.endIndex = high;
        this.sum = sum;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "MaximumSubarray{" +
                "startIndex=" + startIndex +
                ", endIndex=" + endIndex +
                ", sum=" + sum +
                '}';
    }
}
