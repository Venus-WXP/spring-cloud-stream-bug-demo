package com.example.beantest.bean;

import org.springframework.stereotype.Component;

/**
 * @author Venus
 * @since 1.0.0
 */
@Component
public class ConcreteA1 implements A{

    private ADep aDep;

    public ConcreteA1(ADep aDep) {
        this.aDep = aDep;
    }

    @Override
    public void say() {
        System.out.println("I am the concrete A1");
    }
}
