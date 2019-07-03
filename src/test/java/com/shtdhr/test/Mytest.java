package com.shtdhr.test;

import com.shtdhr.service.AopServcie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AopServcie aopService = (AopServcie) context.getBean("aopService");
        aopService.add(1);
    }

}
