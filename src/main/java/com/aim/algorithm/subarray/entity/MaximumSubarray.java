package com.aim.algorithm.subarray.entity;

public class MaximumSubarray {
    private Integer startIndex;
    private Integer endIndex;
    private Integer sum;

    public MaximumSubarray(){}

    public MaximumSubarray(int low, int high, int sum) {
        this.startIndex = low;
        this.endIndex = high;
        this.sum = sum;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
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
