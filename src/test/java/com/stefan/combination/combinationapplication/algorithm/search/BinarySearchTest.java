package com.stefan.combination.combinationapplication.algorithm.search;

import com.stefan.combination.combinationapplication.CombinationApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = CombinationApplication.class)
class BinarySearchTest {

    @Autowired
    BinarySearch binarySearch;

    @Test
    public void searchTest() {
        assertEquals(2,binarySearch.search(new int[]{1,2,3,4,5},3));
    }

    @Test
    public void searchNotFoundTest() {
        assertEquals(-1,binarySearch.search(new int[]{1,2,3,4,5},0));
    }

    @Test
    public void searchTest2() {
        assertEquals(5,binarySearch.search(new int[]{-1000,-12,1,23,234,2123},2123));
    }
}