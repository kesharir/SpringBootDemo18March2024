package com.in28minutes.rest.webservices.restfulwebservices.socialmedia.post;

import com.in28minutes.rest.webservices.restfulwebservices.socialmedia.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
