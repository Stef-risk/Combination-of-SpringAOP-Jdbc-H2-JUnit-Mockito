package com.stefan.combination.combinationapplication.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@Configuration
public class BeforeBusinessLayer {

    @Before(value = "com.stefan.combination.combinationapplication.aop.PointCuts.businessLayerExecution()")
    public void beforeBusiness(JoinPoint joinPoint) {
        System.out.println(joinPoint+" is being executed......");
    }
}
