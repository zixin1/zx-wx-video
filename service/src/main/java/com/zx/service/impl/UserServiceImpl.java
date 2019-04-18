package com.zx.service.impl;

import com.zx.mapper.UserMapper;
import com.zx.pojo.Users;
import com.zx.service.UsersService;
import com.zx.utils.ZxFnull;
import com.zx.utils.ZxID;
import com.zx.utils.ZxJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UsersService {

    @Autowired
    UserMapper userMapper;


    @Override
    public boolean selectUsername(String username) {
        String id=userMapper.selectUsername(username);
        return ZxFnull.Fnull(id);
    }

    @Override
    public boolean saveUsers(Users users) {
        users.setId(ZxID.getID());
        int count=userMapper.saveUsers(users);
        if (count>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean selectUsers(Users users) {
        String username=userMapper.selectUsers(users);
        return ZxFnull.Fnull(username);
    }
}
