package com.hao0129.cloud.user.service;

import com.hao0129.cloud.user.entity.User;

/**
 * 用户信息服务
 * @author WANGHAO 2019-07-22
 */
public interface UserService {
    public User findUserById(String id);
    public String findUserNameById(String id);
    public int addUser(User user);
    public int updateUser(User user);
    public int deleteUserById(String id);
}
