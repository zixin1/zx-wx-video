package com.zx.mapper;

import com.zx.pojo.Users;

public interface UserMapper {
    /**
     * 查询是否存在该用户
     */
    String selectUsername(String username);

    /**
     * 保存用户
     */
    int saveUsers(Users users);

    /**
     * 用户登录
     * @param users
     * @return
     */
    String selectUsers(Users users);
}
