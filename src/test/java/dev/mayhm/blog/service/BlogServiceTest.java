package dev.mayhm.blog.service;

import dev.mayhm.blog.mapper.PostMapper;
import dev.mayhm.blog.model.Post;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.BDDMockito.*;
import static org.assertj.core.api.Assertions.*;
import java.util.List;

@SpringBootTest
public class BlogServiceTest {

    @Mock
    private PostMapper postMapper;

    @InjectMocks
    BlogService blogService;

    @Test
    public void whenGetAllPosts_thenReturnAllPosts(){

        List<Post> mockedList = List.of(
                new Post(
                        "First Title",
                        "John Paul Jayme",
                        "This is a test body."),
                new Post(
                        "Second title",
                        "John Paul Jayme",
                        "This is a test body.")
        );

        given(postMapper.getAllPosts())
                .willReturn(mockedList);

        List<Post> actualAllPosts = blogService.getAllPosts();

        then(postMapper)
                .should()
                        .getAllPosts();

        assertThat(actualAllPosts)
                .isEqualTo(mockedList);

    }
}
