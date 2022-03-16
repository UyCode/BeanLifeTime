package com.uycode.beanLifeTime;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Person implements InitializingBean, BeanFactoryAware, BeanNameAware, DisposableBean {

    /**
     * 身份证号码
     */
    private Integer no;

    /**
     * 姓名
     */
    private String name;

    public Person() {
        System.out.println("1. 调用构造方法：孩子出生了！");
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2. 赋值属性：孩子名字叫" + name);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("3. 调用BeanNameAware#setBeanName方法：孩子要上学了，起名");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4. 调用BeanFactoryAware#setBeanFactory方法：选好学校");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6. 调用InitializingBean#afterPropertiesSet方法：入学登记");
    }

    public void init() {
        System.out.println("7. 自定义的init方法：努力上学中。。。。");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("9. 调用DisposableBean#destroy方法：平淡的一生落幕了");
    }

    public void destroyMethod() {
        System.out.println("10. 自定义destroy方法：安安静静的睡了，自己选择的路，再见！");
    }

    public void work() {
        System.out.println("Bean使用中：工作，努力赚钱养家糊口");
    }
}
