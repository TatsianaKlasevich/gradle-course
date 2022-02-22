package com.klasevich.service;

import com.klasevich.dao.UserDao;
import com.klasevich.model.User;

import java.util.List;

public class UserService {
    private final UserDao userDao = new UserDao();
    public List<User> getAll(){
        return userDao.findAll();
    }
}
