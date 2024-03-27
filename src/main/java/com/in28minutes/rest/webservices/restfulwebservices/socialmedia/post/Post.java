package com.in28minutes.rest.webservices.restfulwebservices.socialmedia.post;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.in28minutes.rest.webservices.restfulwebservices.socialmedia.user.User;
import jakarta.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Integer id;
    private String description;
//    @ManyToOne(fetch = FetchType.EAGER) // Along with Post details, user dettails will also be fetched default Eager
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;
    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Post(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Post() {
    }
}
