package dev.mayhm.personalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Map;

@Controller
@CrossOrigin
public class BlogController {

    @GetMapping(path = "/blog")
    String getBlogPosts(Map<String, Object> model,
            @RequestParam(required = false) String search) {
        if(search != null){

        }else{

        }
        model.put("message", "Welcome");
        model.put("time", LocalDate.now());
        return "index";
    }

    @GetMapping(path = "/")
    String emptyPath(Map<String, Object> model) {
        return "redirect:/blog";
    }
}