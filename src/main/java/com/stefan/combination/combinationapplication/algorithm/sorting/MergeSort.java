package com.stefan.combination.combinationapplication.algorithm.sorting;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MergeSort implements SortingAlgorithm{
    @Override
    public int[] sort(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    private void mergeSort(int[] nums, int start, int end) {
        
        if(end>start) {
            int middle=(start+end)>>1;
            mergeSort(nums,start,middle);
            mergeSort(nums,middle+1,end);
            merge(nums,start,middle,end);
        }
    }

    private void merge(int[] nums, int start, int middle, int end) {
        int[] left = Arrays.copyOfRange(nums, start, middle + 1);
        int[] right = Arrays.copyOfRange(nums, middle + 1, end + 1);


        int counter = end;      //记录当前合并到的位置
        int leftCount = left.length - 1, rightCount = right.length - 1;
        while (counter >= start) {           //归并过程中顺便统计逆序对数目

            //！！！需要从后向前进行统计
            if (leftCount < 0) {
                nums[counter--] = right[rightCount--];    //逆序对已经添加完毕
                continue;
            }
            if (rightCount < 0) {
                nums[counter--] = left[leftCount--];
                continue;
            }

            if (left[leftCount] > right[rightCount]) {
                nums[counter--] = left[leftCount--];
            } else {
                nums[counter--] = right[rightCount--];
            }

        }
    }
}
