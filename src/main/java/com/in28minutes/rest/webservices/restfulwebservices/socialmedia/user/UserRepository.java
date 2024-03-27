package com.in28minutes.rest.webservices.restfulwebservices.socialmedia.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    void deleteById(Integer id);
}
