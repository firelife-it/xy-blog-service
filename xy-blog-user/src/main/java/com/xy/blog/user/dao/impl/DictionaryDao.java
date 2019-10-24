package com.xy.blog.user.dao.impl;

import com.xy.blog.user.dao.IDictionaryDao;
import com.xy.blog.user.dao.mapper.DictionaryMapper;
import com.xy.blog.user.dao.model.DictionaryDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author zanhonglei
 * @version V1.0
 * @Description:
 * @date 2019/10/25 0:07
 */
@Repository
public class DictionaryDao implements IDictionaryDao {

    @Autowired
    private DictionaryMapper dictionaryMapper;

    @Override
    public void insert(DictionaryDO dictionaryDO) {
        dictionaryMapper.insert(dictionaryDO);
    }

    @Override
    public void update(DictionaryDO dictionaryDO) {
        dictionaryMapper.updateByPrimaryKeySelective(dictionaryDO);
    }

    @Override
    public void deleteById(String id) {
        DictionaryDO dictionaryDO = new DictionaryDO();
        dictionaryDO.setId(id);
        dictionaryMapper.delete(dictionaryDO);
    }
}
