package com.aim.algorithm.subarray.serviece;

import com.aim.algorithm.subarray.entity.MaximumSubarray;

public interface MaximumSubarrayService {
    /**
     * 查找最大子数组
     * @param input
     * @return
     */
     MaximumSubarray findMaximumSubarray(int[] input);
}
