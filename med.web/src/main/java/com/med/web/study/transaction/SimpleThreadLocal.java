package com.med.web.study.transaction;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Administrator
 * @date : 2016/12/12 0012
 * @Description: 模拟ThreadLocal
 */
public class SimpleThreadLocal {
    private Map valueMap = Collections.synchronizedMap(new HashMap());

    public void set(Object newValue){
        valueMap.put(Thread.currentThread(),newValue);
    }

    public Object get(){
        Thread currentThread = Thread.currentThread();
        Object o = valueMap.get(currentThread);

        if(o == null && !valueMap.containsKey(currentThread)){
            o = initialValue();
            valueMap.put(currentThread,o);
        }

        return o;
    }

    public void remove(){
        valueMap.remove(Thread.currentThread());
    }

    public Object initialValue(){
        return null;
    }
}
