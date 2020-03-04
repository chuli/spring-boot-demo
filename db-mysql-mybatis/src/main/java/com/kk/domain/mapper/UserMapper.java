package com.kk.domain.mapper;

import com.kk.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: kk
 * @Date: 2020-03-03 20:59
 */

@Mapper
public interface UserMapper {

    User findUserByUserName(String userName);

    void updateUserByUserName(User user);

    void deleteUserByUserName(String userName);

    void saveUser(User user);

    List<User> getUserList();
}
