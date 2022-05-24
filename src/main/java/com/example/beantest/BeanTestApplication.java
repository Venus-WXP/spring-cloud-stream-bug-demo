package com.example.beantest;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanTestApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BeanTestApplication.class);
        springApplication.addInitializers(applicationContext -> {
            applicationContext.getBeanFactory().addBeanPostProcessor(new AutowiredAnnotationBeanPostProcessor());
        });
        SpringApplication.run(BeanTestApplication.class, args);
    }

}
