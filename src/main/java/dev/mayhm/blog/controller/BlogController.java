package dev.mayhm.blog.controller;


import dev.mayhm.blog.model.Post;
import dev.mayhm.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;
import java.util.Optional;

@Controller
@CrossOrigin
public class BlogController {

    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping(path = "/blog")
    String getBlogPosts(Model model) {

        model.addAttribute("posts", blogService.getAllPosts());

        return "index";
    }

    @GetMapping(path = "/blog/{id}")
    String getBlogPostById(@PathVariable int id , Model model) {

        Optional<Post> post = blogService.getPostById(id);

        if(post.isPresent()){
            model.addAttribute("post", post.get());
        }else{
            model.addAttribute("error", "Post not found");
        }

        return "post";
    }

    @PostMapping()
    String createBlog(@RequestBody Post post){
        blogService.createPost(post);

        return "";
    }

    @GetMapping(path = "/")
    String emptyPath() {
        return "redirect:/blog";
    }

    @GetMapping(path = "/home")
    String home(Model model) {
        return "redirect:/blog";
    }
}