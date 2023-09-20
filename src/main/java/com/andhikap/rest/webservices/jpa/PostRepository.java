package com.andhikap.rest.webservices.jpa;

import com.andhikap.rest.webservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
