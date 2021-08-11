package com.stefan.combination.combinationapplication.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterBusinessLayer {

    @AfterReturning(value = "com.stefan.combination.combinationapplication.aop.PointCuts.businessLayerExecution()",
                        returning = "result")

    public void afterBusinessLayerExecution(JoinPoint joinPoint,Object result) {
        System.out.println(result+" is returned after the businessLayerExecution : "+joinPoint );
    }
}
