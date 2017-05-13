package com.aijiao.core.dao.impl;

import com.aijiao.core.dao.UserDao;
import com.aijiao.core.model.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 25858 on 2017/5/13.
 */
@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    public List<User> findUserAll() {
        return null;
    }

    public User findUserById(int id) {
        return getSqlSession().selectOne("User.selectByPrimaryKey", id);
    }

    public int addUser(User user) {
        return 0;
    }

    public int deleteUserById(int id) {
        return 0;
    }

    public int updateUserById(int id) {
        return 0;
    }
}
