package cn.king.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 商品订单
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

    private static final long serialVersionUID = 6915796498351841121L;

    /**
     * 订单编号
     */
    private String id;

    /**
     * 订单对应用户信息
     */
    private User user;

}