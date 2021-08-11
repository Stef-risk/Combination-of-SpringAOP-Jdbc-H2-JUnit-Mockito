package com.stefan.combination.combinationapplication;

import com.stefan.combination.combinationapplication.algorithm.sorting.QuickSort;
import com.stefan.combination.combinationapplication.business.SortAndFind;
import com.stefan.combination.combinationapplication.repository.Person;
import com.stefan.combination.combinationapplication.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class CombinationApplication implements CommandLineRunner {
		//继承CommandLineRunner接口可以减少在主函数静态方法中进行测试

	@Autowired
	private  SortAndFind sortAndFinde;
	@Autowired
	PersonDAO  personDAO;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(sortAndFinde.sortAndFind(new int[]{1,2123,-12,23,-1000,234},2123));
		System.out.println(personDAO.findAll());
		System.out.println(personDAO.findByName("Stefrisk"));
		System.out.println(personDAO.findByWeightAndHeight(47,163));
		System.out.println(personDAO.insert(new Person(100,170,70,"Losel",new Date())));

		System.out.println(personDAO.findAll());

	}

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CombinationApplication.class, args);

		//System.out.println("Max weight among all people : "+sortAndFinde.findMaxWeight(personDAO.findAll()));
		SortAndFind sortAndFind=run.getBean(SortAndFind.class);
		System.out.println(sortAndFind.findMaxWeight());
	}

}
