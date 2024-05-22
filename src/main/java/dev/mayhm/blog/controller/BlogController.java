package dev.mayhm.blog.controller;


import dev.mayhm.blog.model.Post;
import dev.mayhm.blog.service.BlogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@CrossOrigin
//@RequestMapping("v1/api/theFigTree")
public class BlogController {

    private final BlogService blogService;

    @Value("${cloudfront.url}")
    private String cloudfrontUrl;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping(path = "")
    @Operation(summary = "Get all blog posts",
            description = "Returns a list of posts"
    )
    @ApiResponse(responseCode = "200",
        description = "Successfully retrieved blog posts.",
            content = {@Content(mediaType = MediaType.TEXT_HTML_VALUE)}
    )
    String getBlogPosts(Model model) {
        List<Post> allPosts = blogService.getAllPosts();

        Post feature = allPosts.get(0);
        feature.setImagePath(cloudfrontUrl + "/" + feature.getImagePath());

        List<List<Post>> partitionedListOfPosts = partitionPosts(allPosts);

        for (List<Post> postList : partitionedListOfPosts) {
            for (Post p : postList) {
                p.setImagePath(cloudfrontUrl + "/" + p.getImagePath());
            }
        }
        model.addAttribute("featurePost",feature );
        model.addAttribute("partitionedListOfPosts", partitionedListOfPosts );

        return "index";
    }

    @GetMapping(path = "/blog/{id}")
    String getBlogPostById(@PathVariable int id , Model model) {
        System.out.println("ID :" + id);
        Optional<Post> post = blogService.getPostById(id);

        if(post.isPresent()){
            Post actual = post.get();
            model.addAttribute("post", actual );
            model.addAttribute("post_url", cloudfrontUrl + "/" + actual.getImagePath() );
        }else{
            model.addAttribute("error", "Post not found");
        }

        return "fragments :: postDetail";
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



//    @GetMapping(path = "/")
//    String emptyPath() {
//        return "redirect:/blog";
//    }

    @GetMapping(path = "/home")
    String home(Model model) {
        return "redirect:/blog";
    }

    private List<List<Post>> partitionPosts(List<Post> posts) {
        List<List<Post>> partitions = new ArrayList<>();
        int index = 1;
        int[] partitionSizes = {1, 2, 3};

        while (index < posts.size()) {
            for (int size : partitionSizes) {
                if (index + size <= posts.size()) {
                    partitions.add(posts.subList(index, index + size));
                } else {
                    partitions.add(posts.subList(index, posts.size()));
                }
                index += size;
                if (index >= posts.size()) break;
            }
        }

        return partitions;
    }
}