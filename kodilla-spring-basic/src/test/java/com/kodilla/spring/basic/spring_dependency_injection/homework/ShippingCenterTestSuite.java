package com.kodilla.spring.basic.spring_dependency_injection.homework;


import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest (classes = ShippingCenterApp.class)
public class ShippingCenterTestSuite {

    @Autowired
    ShippingCenter shippingCenter;

    @Test
    public void shouldReturnSuccessMessageWhenWeightIsBelow30 (){
        //given
        String address = "New York";
        double weight = 29;
        //when
         String message = shippingCenter.sendPackage(address, weight);
         //then
        Assertions.assertEquals("Package delivered to: New York", message);
    }

    @Test
    public void shouldReturnFailMessageWhenWeightIsAbove30 () {
        //given
        String address = "New York";
        double weight = 31;
        //when
        String message = shippingCenter.sendPackage(address, weight);
        //then
        Assertions.assertEquals ("Package not delivered to: New York", message);
    }

    @Test
    public void shouldReturnSuccessMessageWhenWeightIsExactly30 (){
        //given
        String address = "New York";
        double weight = 30;
        //when
        String message = shippingCenter.sendPackage(address, weight);
        //then
        Assertions.assertEquals("Package delivered to: New York", message);
    }
}
