package com.test.blog.blog_app;

import com.test.blog.blog_app.controller.PostController;
import com.test.blog.blog_app.payload.PostDto;
import com.test.blog.blog_app.service.PostService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
;

public class PostControllerTest {
    @Mock
    private PostService postService;

    @InjectMocks
    private PostController postController;

    public PostControllerTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testUpdatePost() {
        // Given
        long postId = 1L;
        PostDto postDto = new PostDto();
        postDto.setId(postId);
        postDto.setTitle("OK");
        postDto.setContent("OK");
        postDto.setDescription("OK");

        when(postService.updatePost(postDto, postId)).thenReturn(postDto);

        // When
        ResponseEntity<PostDto> responseEntity = postController.updatePost(postDto, postId);

        // Then
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(postDto, responseEntity.getBody());

        // Verify that postService.updatePost was called with the correct arguments
        verify(postService, times(1)).updatePost(postDto, postId);
    }
}
