package com.xy.blog.user.dao.model;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author zanhonglei
 * @version V1.0
 * @Description: 用户DO
 * @date 2019/10/21 21:45
 */
@Data
@Table(name = "t_user")
public class UserDO {
    @Id
    private String id;
    private String userName;
    private String email;
    private String phone;
    private Date createTime;
    private Date updateTime;

}
