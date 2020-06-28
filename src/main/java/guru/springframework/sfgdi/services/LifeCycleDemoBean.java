package guru.springframework.sfgdi.services;

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
        System.out.println("## I am in lifecycle bean constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycleBean  has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Been Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## MyBean name is :"+ name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    @PostConstruct
    public  void postConstruct(){
        System.out.println("## The postConstruct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## The preDestroy annotated method has been called");
    }

    public void beforeInit(){
        System.out.println("## Before Init  - Called by bean post processor");
    }

    public void afterInit(){
        System.out.println("## After Init -called by bean post processor");
    }

}
