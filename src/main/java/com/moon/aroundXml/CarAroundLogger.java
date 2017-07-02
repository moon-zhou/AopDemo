package com.moon.aroundXml;

import org.aspectj.lang.ProceedingJoinPoint;

public class CarAroundLogger {

    public void aroundRun(ProceedingJoinPoint joinpoint) {
        System.out.println("around model......");
        System.out.println("car is going to run");
        
        try {
            // 调用被代理的对象的目标方法，本例中指向Car.go()方法
            joinpoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        
        System.out.println("car is running");
    }
}