package com.med.common.reflect;

/**
 * Created by meddkim on 16-11-14.
 */
public class CLoarderTest {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println("current loader:"+loader);
        System.out.println("parent loader loader:"+loader.getParent());
        System.out.println("grandparent loader:"+loader.getParent().getParent());
    }
}
