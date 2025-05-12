package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClockTestSuite {

    @Test
    public void shouldCreateDifferentBeanInDifferentTime (){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock bean1Time1 = context.getBean(Clock.class);
        Clock bean2Time2 = context.getBean(Clock.class);
        Clock bean3Time3 = context.getBean(Clock.class);
        //then
        Assertions.assertNotEquals(bean1Time1, bean2Time2);
        Assertions.assertNotEquals(bean2Time2, bean3Time3);
        Assertions.assertNotEquals(bean1Time1, bean3Time3);
    }
}
