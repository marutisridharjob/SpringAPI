package com.example.springapi.api.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "a", 21, "a@mail.com");
        User user2 = new User(2, "a", 32, "b@mail.com");
        User user3 = new User(3, "a", 43, "c@mail.com");
        User user4 = new User(4, "a", 54, "d@mail.com");
        User user5 = new User(5, "a", 65, "e@mail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userList) {
            if (user.getId() == id) {
                optional = Optional.of(user);

                return optional;
            }
        }
        return optional;
    }
}
