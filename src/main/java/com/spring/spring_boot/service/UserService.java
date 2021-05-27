package com.spring.spring_boot.service;

import java.util.List;

import com.spring.spring_boot.model.User;
import com.spring.spring_boot.model.Role;


public interface UserService {
    List<User> getAllUsers();

    void save(User user);

    User show(int id);

    void update(User user, String[] role);

    Role showRole(int id);

    void delete(int id);

    User findByUserName(String userName);
}
