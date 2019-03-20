package com.ssm.mapper;

import com.ssm.model.OrdersExpand;

import java.util.List;

public interface UserMapper {
    List<OrdersExpand> selectUsersOrders();
}
