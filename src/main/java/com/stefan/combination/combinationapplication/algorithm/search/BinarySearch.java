package com.stefan.combination.combinationapplication.algorithm.search;

import org.springframework.stereotype.Component;

@Component
public class BinarySearch implements SearchAlgorithm{

    @Override
    public int search(int[] nums, int numberToSearch) {
        int start=0;
        int end=nums.length-1;
        int middle=(start+end) >>1;

        int index=-1;
        while(end>=start) {
            if(nums[middle]==numberToSearch) {
                index=middle;
                break;
            }
            if(nums[middle]>numberToSearch) {
                end=middle-1;
            }
            if(nums[middle]<numberToSearch) {
                start=middle+1;
            }

            middle=(start+end)>>1;
        }

        return index;
    }
}
