package com.uycode.beanLifeTime;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class IBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5. 调用BeanPostProcessor.postProcessBeforeInitialization方法：到学校报名");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("8. 调用BeanPostProcessor.postProcessAfterInitialization方法：毕业拿到大学毕业证！");
        return bean;
    }
}
