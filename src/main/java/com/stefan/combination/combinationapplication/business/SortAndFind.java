package com.stefan.combination.combinationapplication.business;

import com.stefan.combination.combinationapplication.algorithm.search.SearchAlgorithm;
import com.stefan.combination.combinationapplication.algorithm.sorting.SortingAlgorithm;
import com.stefan.combination.combinationapplication.repository.Person;
import com.stefan.combination.combinationapplication.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service        //先将一个给定的数组排序，之后在其中使用二分查找找到给定的查询值的index ，未找到返回-1
public class SortAndFind {

    @Autowired
    SortingAlgorithm sortingAlgorithm;
    @Autowired
    SearchAlgorithm searchAlgorithm;
    @Autowired
    PersonDAO personDAO;

    public Integer sortAndFind(int[] nums,int numberToFind) {
        nums=sortingAlgorithm.sort(nums);
//        System.out.println(Arrays.toString(nums));
        int index=searchAlgorithm.search(nums, numberToFind);
//        System.out.println(index);
        return index;
    }

    public Integer findMaxWeight() {        //从jdbc返回的数据中获取最大体重
        int max=Integer.MIN_VALUE;
        List<Person> persons=personDAO.findAll();

        for(int i=0;i<persons.size();i++) {
            max=Math.max(max,persons.get(i).getWeight());
        }

        System.out.println("Max weight :" +max);
        return max;
    }

}
