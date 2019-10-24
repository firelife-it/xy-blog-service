package com.xy.blog.user.dao.mapper;

import com.xy.blog.user.dao.model.UserDO;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @author zanhonglei
 * @version V1.0
 * @Description: 用户Mapper
 * @date 2019/10/24 23:40
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
}
