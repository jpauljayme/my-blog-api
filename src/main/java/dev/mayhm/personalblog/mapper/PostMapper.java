package dev.mayhm.personalblog.mapper;

import dev.mayhm.personalblog.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostMapper {

    @Select("Select * from tbl_post")
    List<Post> findAllPosts();
}
