package com.xy.blog.user.dao.impl;

import com.xy.blog.user.dao.IUserDao;
import com.xy.blog.user.dao.mapper.UserMapper;
import com.xy.blog.user.dao.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author zanhonglei
 * @version V1.0
 * @Description: 用户Dao
 * @date 2019/10/24 23:50
 */
@Repository
public class UserDao implements IUserDao {

    @Autowired
    private UserMapper userMapper;


    @Override
    public void add(UserDO userDO) {
        userMapper.insert(userDO);
    }

    @Override
    public void delete(String id) {
        UserDO userDO = new UserDO();
        userDO.setId(id);
        userMapper.delete(userDO);
    }

    @Override
    public void update(UserDO userDO) {
        userMapper.updateByPrimaryKeySelective(userDO);
    }
}
