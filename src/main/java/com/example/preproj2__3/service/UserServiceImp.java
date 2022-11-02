package com.example.preproj2__3.service;

import com.example.preproj2__3.dao.UserDao;
import com.example.preproj2__3.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void change(User user) {
        userDao.change(user);
    }

    @Override
    public List<User> toList() {
        return userDao.toList();
    }
}
