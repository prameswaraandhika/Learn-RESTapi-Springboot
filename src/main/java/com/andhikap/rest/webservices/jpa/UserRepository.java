package com.andhikap.rest.webservices.jpa;

import com.andhikap.rest.webservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
