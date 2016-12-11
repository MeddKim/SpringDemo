package com.med.web.study.aop.advisor;

/**
 * Created by Meddkim on 2016/12/11.
 */
public class Waiter {

    public void greetTo(String name) {
        System.out.println("greet to "+name+" ...");
    }

    public void serveTo(String name) {
        System.out.println("serve to "+name+" ...");
    }
}
