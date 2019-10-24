package com.xy.blog.user.dao;

import com.xy.blog.user.dao.model.UserDO;

/**
 * @author zanhonglei
 * @version V1.0
 * @Description: 用户操作dao
 * @date 2019/10/21 21:36
 */
public interface IUserDao {


    public void add(UserDO userDO);

    public void delete(String id);

    public void update(UserDO userDO);



}
