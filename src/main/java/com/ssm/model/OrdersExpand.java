package com.ssm.model;

/**
 * 订单的扩展类 ：要包含订单和用户的所有字段。
 */
public class OrdersExpand extends  Oreders {

    private User user;//association

    public User getUser() {
            return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "OrdersExpand{" +
                super.toString()+
                "user=" + user +
                '}';
    }
}
