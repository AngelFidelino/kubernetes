package com.aflr.mysqldemo.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aflr.mysqldemo.dao.UserDao;
import com.aflr.mysqldemo.entity.User;

@RestController
@RequestMapping("users")
public class UsersController {
    private UserDao userDao;
    public UsersController(UserDao userDao){
        this.userDao = userDao;
    }
    @GetMapping("/")
    public List<User> getUsers(){
        return userDao.findAll();
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user){
        return userDao.save(user);
    }
}
