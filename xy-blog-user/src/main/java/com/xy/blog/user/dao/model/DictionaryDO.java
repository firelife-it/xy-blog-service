package com.xy.blog.user.dao.model;

import lombok.Data;

import java.util.Date;

/**
 * @author zanhonglei
 * @version V1.0
 * @Description: 用户字典
 * @date 2019/10/24 23:59
 */
@Data
public class DictionaryDO {
    private String id ;
    private String name;
    private String code;
    private String type;
    private String value;
    private Date createTime;

}
