package dev.mayhm.blog.config;

import dev.mayhm.blog.mapper.PostMapper;
import dev.mayhm.blog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostsLoader implements CommandLineRunner {
    private final PostMapper postMapper;

    @Autowired
    public PostsLoader(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    @Override
    public void run(String... args) throws Exception {

        Post post = new Post();
    }
}
