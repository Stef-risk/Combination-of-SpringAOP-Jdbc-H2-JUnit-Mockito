package com.stefan.combination.combinationapplication.algorithm.sorting;

import com.stefan.combination.combinationapplication.CombinationApplication;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = CombinationApplication.class)
class MergeSortTest {

    @Autowired
    MergeSort ms;

    @BeforeAll
    public void before() {
        System.out.println("Test for merge sort begin....");
    }

    @AfterAll
    public void after() {
        System.out.println("Test for merge sort end....");
    }

    @Test
    public void mergeSortTest() {
        assertArrayEquals(new int[]{1,2,3,4,5},ms.sort(new int[] {1,3,4,2,5}));
        assertArrayEquals(new int[]{-1,3,9,10,9999},ms.sort(new int[]{10,9,-1,3,9999}));
    }
}