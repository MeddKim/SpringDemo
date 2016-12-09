package com.med.web.study.aop;

/**
 * @author: Administrator
 * @date : 2016/12/7 0007
 * @Description:
 */
public class MethodPerformance {
    private long begin;
    private long end;
    private String serviceMethod;

    public MethodPerformance(String serviceMethod){
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }

    public void printPerformance(){
        end = System.currentTimeMillis();
        long elapse = end - begin;
        System.out.println(serviceMethod+"话费了"+elapse+"毫秒");
    }
}
