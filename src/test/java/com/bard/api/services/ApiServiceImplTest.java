package com.bard.api.services;

import com.bard.api.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    List<User> userData;

    @BeforeEach
    void setUp() {
        userData = apiService.getUsers(4);
    }

    @Test
    void testGetUsers() {
        System.out.println(userData.get(0).getName());
        assertEquals(4, userData.size());
    }

    @Test
    void testGetUserName() {
        User user = userData.get(0);

        assertEquals("Leanne Graham", user.getName());
    }
}