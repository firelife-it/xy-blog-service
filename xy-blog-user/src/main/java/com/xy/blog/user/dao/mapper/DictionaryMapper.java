package com.xy.blog.user.dao.mapper;

import com.xy.blog.user.dao.model.DictionaryDO;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @author zanhonglei
 * @version V1.0
 * @Description: 属性字典
 * @date 2019/10/25 0:04
 */
@Mapper
public interface DictionaryMapper extends BaseMapper<DictionaryDO> {

}
