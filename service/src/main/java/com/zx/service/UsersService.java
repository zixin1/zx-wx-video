package com.zx.service;

import com.zx.pojo.Users;

import java.util.List;

public interface UsersService {
    /**
     * 查询是否有该用户
     */
    boolean selectUsername(String username);

    /**
     * 保存用户
     */
    boolean saveUsers (Users users);

    /**
     * 用户登录
     * @param users
     * @return
     */
    boolean selectUsers(Users users);
}
