package com.zlclass.online_class.dao;

import com.zlclass.online_class.domain.VideoOrder;

import java.util.List;

public interface VideoOrderMapper {

    /**
     * 查询所有订单,关联用户信息
     * @return
     */
    List<VideoOrder> queryVideoOrderList();


    /**
     * 查询所有订单,关联用户信息,懒加载
     * @return
     */
    List<VideoOrder> queryVideoOrderListLazy();
}
