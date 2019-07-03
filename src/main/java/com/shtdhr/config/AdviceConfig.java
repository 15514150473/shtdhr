package com.shtdhr.config;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceConfig {

    public  void before(){
        System.out.println("before.......");
    }
    public  void afterReturning(){
        System.out.println("afterReturning.......");
    }
    public  void afterThrowing(){
        System.out.println("afterThrowing.......");
    }
    public  void after(){
        System.out.println("after.......");
    }
    public  void around(ProceedingJoinPoint joinPoint){


        Object[] args = joinPoint.getArgs();


        try {
            System.out.println("around\tbefore.......");
            Object proceed = joinPoint.proceed(args);
            System.out.println("around\tafterReturning.......");
        } catch (Throwable throwable) {
            System.out.println("around\tafterThrowing.......");
            throwable.printStackTrace();
        } finally {
            System.out.println("around\tafter.......");
        }



    }

}
