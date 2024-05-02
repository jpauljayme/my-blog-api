package dev.mayhm.blog.mapper;

import dev.mayhm.blog.model.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {

    List<Post> getAllPosts();

    Optional<Post> findPostByTitle(String title);
    void insertPost(Post post);

    int countAllPosts();

}
