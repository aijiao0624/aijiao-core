package com.aijiao.core.service.impl;

import com.aijiao.core.dao.UserDao;
import com.aijiao.core.model.User;
import com.aijiao.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 25858 on 2017/5/13.
 */
@Repository("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findUserAll() {
        return userDao.findUserAll();
    }

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public int deleteUserById(int id) {
        return userDao.deleteUserById(id);
    }

    public int updateUserById(int id) {
        return userDao.updateUserById(id);
    }

}
