package com.xy.blog.common.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author zanhonglei
 * @version V1.0
 * @Description: Mapper插件
 * @date 2019/10/23 0:59
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
