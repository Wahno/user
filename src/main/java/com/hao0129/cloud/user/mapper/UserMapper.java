package com.hao0129.cloud.user.mapper;

import com.hao0129.cloud.user.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * 用户信息Mybatis映射
 * @author WANGHAO 2019-07-22
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user_info where id=#{id}")
    public User findUserById(String id);

    @Select("select name from t_user_info where id=#{id}")
    public String findUserNameById(String id);

    @Insert("insert into t_user_info(id,name,sex,phone,qq,email) values(#{id},#{name},#{sex},#{phone},#{qq},#{email})")
    public int addUser(User user);

    @Update("update t_user_info set id=#{id},name=#{name},sex=#{sex},phone=#{phone},qq=#{qq},email=#{email}")
    public int updateUser(User user);

    @Delete("delete from t_user_info where id=#{id}")
    public int deleteUserById(String id);
}
