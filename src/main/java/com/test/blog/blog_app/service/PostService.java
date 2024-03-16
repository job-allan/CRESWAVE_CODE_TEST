package com.test.blog.blog_app.service;

import com.test.blog.blog_app.entity.Post;
import com.test.blog.blog_app.payload.PostDto;
import com.test.blog.blog_app.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

    List<Post> searchPostsByTitle(String title);
}
