package com.in28minutes.rest.webservices.restfulwebservices.socialmedia.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static Integer usersCount = 0;

    static {
        users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Eve", LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount, "Jim", LocalDate.now().minusYears(20)));
        users.add(new User(++usersCount, "Andy", LocalDate.now().minusYears(60)));
        users.add(new User(++usersCount, "Jeff", LocalDate.now().minusYears(70)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        return users.stream().filter(u -> u.getId() == id).findAny().get();
    }

    public User save(User u) {
        u.setId(++usersCount);
        users.add(u);
        return u;
    }
//    public List<User> findAll();
//    public User save(User user);
//    public User findOne(Integer id);
}
