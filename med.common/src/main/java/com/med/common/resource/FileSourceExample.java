package com.med.common.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by meddkim on 16-11-15.
 */
public class FileSourceExample {

    public static void main(String[] args) {

        try {

            String filePath = "/meddkim/Common/test.txt";
            Resource res1 = new FileSystemResource(filePath);
            /**
             * 注意：
             * １. ClassPathResource构造函数接受两个参数第一个为路径如"conf/test.txt"，第二个为累的class对象
             * 　　如：FileSourceExample.class,该方法会寻找FileSourceExample类下的conf/test.txt文件，若第
             *     二个参数不传，则寻找`类根目录下`的conf/test.txt路径
             * 2.　上面说的路径注意是指编译候的文件路径，一般java源码会被编译到'classes/包/类.class'的路径下，如该项目中
             * 　　虽然我们在源码路径下新建了`conf/test.txt`文件，但是该文件并没有被复制到编译后的路径中，所有运行该代码
             * 　　会抛出　FileNotFound错误，我们可以之间新建'classes/conf/test.txt'，可以看到，这个时候就可以正常运行
             */
            Resource res2 = new ClassPathResource("conf/test.txt");

            InputStream ins1 = res1.getInputStream();
            InputStream ins2 = res2.getInputStream();


            System.out.println("res1:"+res1.getFilename());
            System.out.println("res2:"+res2.getFilename());
        }catch (IOException e){
            e.printStackTrace();

        }



    }
}
