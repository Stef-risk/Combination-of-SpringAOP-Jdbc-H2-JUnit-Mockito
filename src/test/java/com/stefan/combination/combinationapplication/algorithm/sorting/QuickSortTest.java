package com.stefan.combination.combinationapplication.algorithm.sorting;

import com.stefan.combination.combinationapplication.CombinationApplication;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = CombinationApplication.class)       //配置上下文
class QuickSortTest {

    //This JUnit Test is for quickSort algorithm
    @Autowired
    QuickSort qs;

    @BeforeAll
    public void before() {
        System.out.println("Test for quick sort begin....");
    }

    @AfterAll
    public void after() {
        System.out.println("Test for quick sort end....");
    }

    @Test
    public void SortTest() {
        assertArrayEquals(new int[]{1,2,3,4,5},qs.sort(new int[] {1,3,4,2,5}));
        assertArrayEquals(new int[]{-1,3,9,10,9999},qs.sort(new int[]{10,9,-1,3,9999}));
    }

}