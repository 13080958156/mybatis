package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

public interface UserDao {




    /**
     * 用户持久层接口
     */


    /**
     * 查询所有操作
     * @return
     */
    List<User> getUserList();//查询User表内所有的内容
}



