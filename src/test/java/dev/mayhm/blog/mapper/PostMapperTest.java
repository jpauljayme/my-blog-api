package dev.mayhm.blog.mapper;

import dev.mayhm.blog.model.Post;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
//@MybatisTest
//@ExtendWith(SpringExtension.class)
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PostMapperTest {

    @Autowired
    PostMapper postMapper;

    @Test
    void test_getAllPosts_isEmpty(){

        assertThat(postMapper.getAllPosts())
                .isEmpty();
    }

    @Test
    public void whenRecordsInDatabase_shouldReturnPostWithGivenTitle() {

        Post post = new Post(0,
                "Title",
                "Author",
                "Body");
        postMapper.insertPost(post);

        List<Post> allPosts = postMapper.getAllPosts();

        assertThat(postMapper.countAllPosts())
                .isEqualTo(1);

    }
}
