package com.stefan.combination.combinationapplication.business;

import com.stefan.combination.combinationapplication.algorithm.search.SearchAlgorithm;
import com.stefan.combination.combinationapplication.algorithm.sorting.SortingAlgorithm;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

//通过Mockito测试SortAndFind 的功能

@ExtendWith(MockitoExtension.class)
class SortAndFindTest {

    @Mock
    SortingAlgorithm sortingAlgorithm;
    @Mock
    SearchAlgorithm searchAlgorithm;
    @InjectMocks
    SortAndFind sortAndFind;

    @Test
    public void sortTest() {
        when(sortingAlgorithm.sort(new int[]{18,20,21,29,30,12,14})).thenReturn(new int[]{12,14,18,20,21,29,30});
        when(searchAlgorithm.search(new int[]{12,14,18,20,21,29,30},20)).thenReturn(3);

        assertEquals(3,sortAndFind.sortAndFind(new int[]{18,20,21,29,30,12,14},20));
    }

}