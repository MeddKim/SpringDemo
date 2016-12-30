package com.med.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: Administrator
 * @date : 2016/12/30 0030
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "author")
public class Author {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;


}
