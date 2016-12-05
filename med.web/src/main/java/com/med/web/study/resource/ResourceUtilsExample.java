package com.med.web.study.resource;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * Created by Administrator on 2016/11/26 0026.
 */
public class ResourceUtilsExample {

    /**
     * Spring 支持的资源类型的地址前缀
     *    classpath : 类路径中加载
     *    file: 冲文件系统目录中加载，支持绝对和相对路径
     *    http:// 从web服务器中加载
     *    ftp://从FTP服务器中加载
     *
     */

    public static void main(String[] args)throws Throwable {

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("classpath*:com/med/web/**/*.xml");

        for(Resource resource:resources){
            System.out.println(resource.getDescription());
        }
    }
}
