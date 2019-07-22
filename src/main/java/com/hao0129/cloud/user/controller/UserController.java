package com.hao0129.cloud.user.controller;

import com.alibaba.fastjson.JSON;
import com.hao0129.cloud.user.entity.User;
import com.hao0129.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author WANGHAO 2019-07-22
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") String id){
        return userService.findUserById(id);
    }
    @GetMapping("/name/{id}")
    public String findUserNameById(@PathVariable("id") String id){
        return userService.findUserNameById(id);
    }
    @PostMapping(value = {"/",""})
    public int addUser(@RequestBody String params){
        return userService.addUser(JSON.parseObject(params,User.class));
    }
    @PutMapping(value = {"/",""})
    public int updateUser(@RequestBody String params){
        return userService.updateUser(JSON.parseObject(params,User.class));
    }
    @DeleteMapping("/{id}")
    public int deleteUserById(@PathVariable("id") String id){
        return userService.deleteUserById(id);
    }
}
