package com.zx.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface TestMapper {
    /**
     * 转账操作
     */

    /*
    a 扣100块
     */
    @Update("update test set count=(count-#{count}) where name=#{name}")
    void insert(@Param("name") String name,@Param("count") int count);
    /*
    b增加100
     */

    @Update("update test set count=(count+#{count}) where name=#{name}")
    void inserts(@Param("name") String name,@Param("count") int count);
}
