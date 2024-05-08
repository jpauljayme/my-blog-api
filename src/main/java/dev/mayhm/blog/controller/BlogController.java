package dev.mayhm.blog.controller;


import dev.mayhm.blog.model.Post;
import dev.mayhm.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@CrossOrigin
public class BlogController {

    private final BlogService blogService;

    @Value("${cloudfront.url}")
    private String cloudfrontUrl;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping(path = "/blog")
    String getBlogPosts(Model model) {
        List<Post> allPosts = blogService.getAllPosts();
        for (Post p : allPosts) {
            p.setImagePath(cloudfrontUrl + "/" + p.getImagePath());
        }

        model.addAttribute("posts", allPosts );

        return "index";
    }

    @GetMapping(path = "/blog/{id}")
    String getBlogPostById(@PathVariable int id , Model model) {

        Optional<Post> post = blogService.getPostById(id);

        if(post.isPresent()){
            Post actual = post.get();
            model.addAttribute("post", actual );
            model.addAttribute("post_url", cloudfrontUrl + "/" + actual.getImagePath() );
        }else{
            model.addAttribute("error", "Post not found");
        }

        return "post";
    }



    @PostMapping("/blog")
    String createPost(@ModelAttribute Post post,
                      Model model){
        blogService.createPost(post);

        model.addAttribute("message",
                "Successfully created blog post!");
        return "redirect:/blog";
    }

    @GetMapping("/blog/createPost")
    String createPostView(Model model){
        return "createPost";
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