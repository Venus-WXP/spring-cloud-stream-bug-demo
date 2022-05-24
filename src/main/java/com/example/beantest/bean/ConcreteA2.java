package com.example.beantest.bean;

import org.springframework.stereotype.Component;

/**
 * @author Venus
 * @since 1.0.0
 */
@Component
public class ConcreteA2 implements A{
    @Override
    public void say() {
        System.out.println("I am the concrete A2");
    }
}
