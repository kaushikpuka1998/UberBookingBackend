package com.kgstrivers.Uber;

import com.kgstrivers.Uber.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyProfileController {

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> list = new ArrayList<User>();
        list.add(new User(546, "John"));
        list.add(new User(894, "Mary"));
        list.add(new User(326, "Jane"));
        return list;

    }
}
