package com.in28minutes.rest.webservices.restfulwebservices.socialmedia.user;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import jakarta.validation.Valid;

@Validated
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

    // Add link to response: http://localhost:8080/users

    // EntityModel
    /**
     *
     *
     */

    // WebMvcLinkBuilder


    @GetMapping("/users/{userId}")
    public EntityModel<User> retrieveUser(@PathVariable Integer userId) {
        User u = userDaoService.findOne(userId);
        if (u == null) {
            throw new UserNotFoundException("userId : " + userId);
        }
        EntityModel<User> entityModel = EntityModel.of(u);
        WebMvcLinkBuilder link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }

    //POST /users
    @PostMapping("/users")
    public ResponseEntity createUser(@Valid @RequestBody User user) {
        User savedUser = userDaoService.save(user);
        // location = /users/{userId}
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userDaoService.deleteById(id);
    }
}
