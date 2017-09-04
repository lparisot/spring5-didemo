package com.lpa.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("## 1) I'm in the LifeCycleBean Constructor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## 2) My bean name is " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## 3) Bean factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 4) Application context has been set");
    }

    public void beforeInit() {
        System.out.println("## 5) before init - called by bean post processor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## 6) The post construct annotated method has been called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 7) The LifeCycleBean has its properties set");
    }

    public void afterInit() {
        System.out.println("## 8) after init - called by bean post processor");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## 9) The pre destroy annotated method has been called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## 10) The LifeCycleBean has been terminated");
    }
}
