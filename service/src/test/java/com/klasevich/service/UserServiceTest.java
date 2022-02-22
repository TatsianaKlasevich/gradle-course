package com.klasevich.service;

import com.klasevich.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceTest {

    private final UserService userService = new UserService();

    @Test
    void getAll() {
        List<User> actual = userService.getAll();
        assertEquals(3, actual.size());

    }
}