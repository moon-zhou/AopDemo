package com.moon;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moon.aroundXml.CarAround;
import com.moon.normalXml.Car;

public class App {
    @Test
    public void testNormal() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Car car = (Car) context.getBean("car");
        car.go();
    }

    @Test
    public void testAround() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        CarAround carAround = (CarAround) context.getBean("carAround");
        carAround.go();
    }
}