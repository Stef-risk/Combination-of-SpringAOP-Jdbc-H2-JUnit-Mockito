package com.stefan.combination.combinationapplication.algorithm.sorting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Primary        //优先使用快速排序
public class QuickSort implements SortingAlgorithm{
    @Override
    public int[] sort(int[] nums) {
       quickSort(nums,0,nums.length-1);
       return nums;
    }

    private void quickSort(int[] nums, int start, int end) {
        if(start<end+1) {
            int p=partition(nums,start,end);
            quickSort(nums,start,p-1);
            quickSort(nums,p+1,end);
        }
    }

    private void swap(int[] nums,int index1,int index2) {
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }

    private int getPivatol(int start,int end) {
        Random random=new Random();
        return random.nextInt(end-start+1)+start;
    }

    private int partition(int[] nums, int start, int end) {
        swap(nums,start,getPivatol(start, end));
        int border=start+1;

        for(int i=border;i<=end;i++) {
            if(nums[i]<nums[start]) {
                swap(nums,i,border++);
            }
        }

        swap(nums,border-1,start);
        return border-1;
    }

}
