package com.in28minutes.rest.webservices.restfulwebservices.socialmedia.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {
    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping("/users/{userId}")
    public User retrieveUser(@PathVariable Integer userId) {
        User u = userDaoService.findOne(userId);
        if (u == null) {
            throw new UserNotFoundException("userId : " + userId);
        }
        return u;
    }

    //POST /users
    @PostMapping("/users")
    public ResponseEntity createUser(@RequestBody User user) {
        User savedUser = userDaoService.save(user);
        // location = /users/{userId}
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
