package com.aijiao.core.dao;

import com.aijiao.core.model.User;

import java.util.List;

public interface UserDao {

    List<User> findUserAll();

    User findUserById(int id);

    int addUser(User user);

    int deleteUserById(int id);

    int updateUserById(int id);

}