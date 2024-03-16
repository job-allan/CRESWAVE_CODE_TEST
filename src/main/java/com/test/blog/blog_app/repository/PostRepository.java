package com.test.blog.blog_app.repository;

import com.test.blog.blog_app.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
