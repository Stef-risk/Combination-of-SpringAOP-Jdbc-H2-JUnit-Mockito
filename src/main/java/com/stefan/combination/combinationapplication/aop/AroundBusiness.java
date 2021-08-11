package com.stefan.combination.combinationapplication.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundBusiness {

    @Around(value = "com.stefan.combination.combinationapplication.aop.PointCuts.businessLayerExecution()")
    public void getBusinessRunTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {       //获取应用层函数的运行时间
        long startTime=System.currentTimeMillis();

        proceedingJoinPoint.proceed();

        long timeTaken=System.currentTimeMillis()-startTime;
        System.out.println("methods run time :"+timeTaken+"ms");
    }
}
