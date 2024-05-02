package dev.mayhm.blog.service;

import dev.mayhm.blog.mapper.PostMapper;
import dev.mayhm.blog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private final PostMapper postMapper;

    @Autowired
    public BlogService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public List<Post> getAllPosts() {
        return postMapper.getAllPosts();
    }

    public void createPost(Post post){
        postMapper.insertPost(post);
    }
}
