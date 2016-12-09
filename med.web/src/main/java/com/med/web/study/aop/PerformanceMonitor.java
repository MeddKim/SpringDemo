package com.med.web.study.aop;

/**
 * @author: Administrator
 * @date : 2016/12/7 0007
 * @Description:
 */
public class PerformanceMonitor {

    private static ThreadLocal<MethodPerformance> methodPerformanceRecord =
            new ThreadLocal<MethodPerformance>();


    public static void begin(String method){
        System.out.println("begin monitor...");
        MethodPerformance mp = new MethodPerformance(method);
        methodPerformanceRecord.set(mp);
    }

    public static void end(){
        System.out.println("end monitor");
        MethodPerformance mp = methodPerformanceRecord.get();
        mp.printPerformance();
    }
}
