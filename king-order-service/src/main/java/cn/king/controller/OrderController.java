package cn.king.controller;

import cn.king.client.UserServiceClient;
import cn.king.domain.entity.Order;
import cn.king.domain.result.DataResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author: wjl@king.cn
 * @time: 2021/8/26 2:35
 * @version: 1.0.0
 * @description:
 * @why:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private UserServiceClient userServiceClient;

    @GetMapping("/{id}")
    public DataResult<Order> findById(@PathVariable String id) {
        final Order order = Order.builder().id(id).user(userServiceClient.findById(UUID.randomUUID().toString().replace("-", "")).getData()).build();
        return order == null ? new DataResult<>(500, "系统错误") : new DataResult<>(order);
    }

}
