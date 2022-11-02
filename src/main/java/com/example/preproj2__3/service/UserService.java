package com.example.preproj2__3.service;

import com.example.preproj2__3.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    void delete(User user);

    void change(User user);

    List<User> toList();
}
