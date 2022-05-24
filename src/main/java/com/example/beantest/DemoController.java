package com.example.beantest;

import com.example.beantest.bean.InterfaceA;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Venus
 * @since 1.0.0
 */
@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class DemoController {

    private final InterfaceA interfaceA;
    private final ApplicationContext applicationContext;

    @GetMapping
    public Object test() {
        this.interfaceA.doSay();
        return this.applicationContext.getBeanDefinitionNames();

    }
}
