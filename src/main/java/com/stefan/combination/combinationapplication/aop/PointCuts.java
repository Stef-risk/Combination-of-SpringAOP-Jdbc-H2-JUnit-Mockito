package com.stefan.combination.combinationapplication.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCuts {

    @Pointcut(value = "execution(* com.stefan.combination.combinationapplication.business.*.*(..))")
    public void businessLayerExecution() {}         //定义一个在business中任何函数的切片

}
