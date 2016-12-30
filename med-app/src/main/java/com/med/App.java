package com.med;

import com.med.domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
//@RestController
@SpringBootApplication
@Controller
public class App
{

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

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }


}
