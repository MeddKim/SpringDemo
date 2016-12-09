package com.med.web.study.aop;

/**
 * @author: Administrator
 * @date : 2016/12/7 0007
 * @Description:
 */
public class ForumServiceImpl implements ForumService {

    public void removeTopic(int topicId){

        //开始性能监控
        PerformanceMonitor.begin("com.med.web.study.aop.ForumServiceImpl.removeTopic");

        System.out.println("模拟删除Topic记录："+topicId);
        try {
            Thread.currentThread().sleep(20);
        }catch (Exception e){
            throw  new RuntimeException(e);
        }

        //结束性能监控
        PerformanceMonitor.end();
    }

    public void removeForum(int forumId) {

        //开始性能监控
        PerformanceMonitor.begin("com.med.web.study.aop.ForumServiceImpl.removeTopic");

        System.out.println("模拟删除Forum记录：" + forumId);
        try {
            Thread.currentThread().sleep(40);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //结束性能监控
        PerformanceMonitor.end();
    }
}