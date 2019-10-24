package com.xy.blog.user.dao;

import com.xy.blog.user.dao.model.DictionaryDO;

/**
 * @author zanhonglei
 * @version V1.0
 * @Description: 用户字典Dao
 * @date 2019/10/24 23:57
 */
public interface IDictionaryDao {

    public void insert(DictionaryDO dictionaryDO);

    public void update(DictionaryDO dictionaryDO);

    public void deleteById(String id);


}
