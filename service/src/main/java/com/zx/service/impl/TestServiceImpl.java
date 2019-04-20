package com.zx.service.impl;

import com.zx.mapper.TestMapper;
import com.zx.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;
    @Transactional
    @Override
    public void mm(String add,String emd,int count) {
        //aaa扣除100块
        testMapper.insert(add,count);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //模拟故障
        //int s=1/0;
        //bbb增加100块
        testMapper.inserts(emd,count);
    }

    /**
     * 另外一个事务管理例子
     */
    public void mm1(){

    }
}
