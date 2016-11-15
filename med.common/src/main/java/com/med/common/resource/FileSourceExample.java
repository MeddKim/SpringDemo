package com.med.common.resource;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Created by meddkim on 16-11-15.
 */
public class FileSourceExample {

    public static void main(String[] args) {

//        Resource res1 =
        Resource res1 = new FileSystemResource("D:/text");
    }
}
