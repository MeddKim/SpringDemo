package com.med.controller;

import com.med.domain.Author;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Administrator
 * @date : 2017/1/5 0005
 * @Description:
 */
@Controller
public class IndexController {
    @Autowired
    private Author author;


    @RequestMapping("/")
    String index(Model model) {
        List<Author> AuthorList = new ArrayList<Author>();
        Author author = new Author();
        Author author1 = new Author();
        author.setName("李四");
        author.setAge(25);
        author1.setName("王哥");
        author1.setAge(26);

        AuthorList.add(author);
        AuthorList.add(author1);

//        return "作者:"+author.getName()+"；年龄"+author.getAge();
        model.addAttribute("singlePerson",author);
        model.addAttribute("AuthorList",AuthorList);
        return "index";
    }
}
