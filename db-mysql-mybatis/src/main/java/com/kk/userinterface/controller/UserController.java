package com.kk.userinterface.controller;

import com.github.pagehelper.PageHelper;
import com.kk.domain.entity.User;
import com.kk.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: kk
 * @Date: 2020-03-03 21:14
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    // http://localhost:8071/user/getUser?username=kk
    @RequestMapping("/getUser")
    public String getUser(String username) {
        User user = userMapper.findUserByUserName(username);
        return user != null ? username + " password is " + user.getUserPassword() : "no exist " + username;
    }

    // http://localhost:8071/user/addUser?username=kk&password=123456
    @RequestMapping("addUser")
    public String addUser(String username, String password) {
        User user = new User(username, password);
        userMapper.saveUser(user);
        return "success";
    }

    // http://localhost:8071/user/updateUser?username=kk&password=abc123
    @RequestMapping("/updateUser")
    public String updateUser(String password, String username) {
        User user = new User(username, password);
        userMapper.updateUserByUserName(user);
        return "success";
    }

    // http://localhost:8071/user/deleteUser?username=kk
    @RequestMapping("/deleteUser")
    public String deleteUser(String username) {
        userMapper.deleteUserByUserName(username);
        return "success";
    }

    // http://localhost:8071/user/getUserList
    @RequestMapping("/getUserList")
    public List getUserList() {
        return userMapper.getUserList();
    }

    // http://localhost:8071/user/getUserListPage?pageNum=1&pageSize=2
    @RequestMapping("/getUserListPage")
    public List getUserListPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.getUserList();
    }
}