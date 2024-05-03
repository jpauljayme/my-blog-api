package dev.mayhm.blog.mapper;

import dev.mayhm.blog.model.Post;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
//@MybatisTest
//@ExtendWith(SpringExtension.class)
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PostMapperTest {

    @Autowired
    PostMapper postMapper;

    @Test
    void test_countAllPosts(){
        assertThat(postMapper.countAllPosts())
                .isEqualTo(1);
    }
    @Test
    public void whenRecordsInDatabase_shouldReturnPostWithGivenTitle() {

        Post newPost = new Post(
                "Hunger by Knut Hamsun",
                "John Paul Jayme",
                "This is a test body.");

        Optional<Post> actualPost = postMapper.findPostByTitle("Hunger by Knut Hamsun");

        assertThat(actualPost.map(Post::getTitle).orElse(null))
                .isEqualTo(newPost.getTitle());
        assertThat(actualPost.map(Post::getAuthor).orElse(null))
                .isEqualTo(newPost.getAuthor());
        assertThat(actualPost.map(Post::getDateCreated).orElse(null))
                .isEqualTo(newPost.getDateCreated());

    }

    @Test
    void givenPostId_thenGetPostById_shouldReturnExistingPost(){

        int postId = 6;
        Optional<Post> postById = postMapper.getPostById(postId);
        assertThat(postById)
                .isPresent();
        assertThat(postById.get().getId())
                .isEqualTo(postId);
    }
}
