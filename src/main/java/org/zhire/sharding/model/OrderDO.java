package org.zhire.sharding.model;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Author: chenqi
 * @Date: 2020.4.16 15:57
 */
@TableName("orders")
public class OrderDO {
    /**
     * 订单编号
     */

    private Long id;
    /**
     * 用户编号
     */
    private Integer userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "OrderDO{" +
                "id=" + id +
                ", userId=" + userId +
                '}';
    }
}
