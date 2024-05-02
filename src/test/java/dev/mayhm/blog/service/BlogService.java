package dev.mayhm.blog.service;

import dev.mayhm.blog.mapper.PostMapper;
import dev.mayhm.blog.model.Post;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    private final PostMapper postMapper;

    public BlogService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public void getAllPosts() {
    }

    public void createPost(Post post){
        postMapper.insertPost(post);
    }
}
