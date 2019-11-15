package cn.shuaijunlan.simpledemo.controller;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 9:16 AM 3/13/19.
 */
public class TestBean implements InitializingBean {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void init(){
        System.out.println("init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
