package com.zlclass.online_class.dao;

import com.zlclass.online_class.domain.User;

import java.util.List;

public interface UserMapper {

    /**
     * 查询所有用户,和其关联的订单信息
     * @return
     */
    List<User> queryUserOrders();


    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User findUserByUserId(int id);
}
