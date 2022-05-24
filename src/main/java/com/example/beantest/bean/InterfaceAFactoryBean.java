package com.example.beantest.bean;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;
import java.util.Collection;

/**
 * @author Venus
 * @since 1.0.0
 */
@RequiredArgsConstructor
public class InterfaceAFactoryBean implements FactoryBean<InterfaceA> {

    private final Collection<A> aCollection;
    private final Class<?> clazz;

    @Override
    public InterfaceA getObject() throws Exception {
        return (InterfaceA) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, (proxy, method, args) -> {
            if (method.getName().equals("doSay")) {
                for (A a : aCollection) {
                    a.say();
                }
                return null;
            }

            return method.invoke(this, args);
        });
    }

    @Override
    public Class<?> getObjectType() {
        return clazz;
    }
}
