package cn.king.client;

import cn.king.domain.entity.Order;
import cn.king.domain.result.DataResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: wjl@king.cn
 * @time: 2021/8/26 2:20
 * @version: 1.0.0
 * @description:
 * @why:
 */
@FeignClient(value = "KING-ORDER-SERVICE")
public interface OrderServiceClient {

    @GetMapping("/order/{id}")
    DataResult<Order> findById(@PathVariable String id);

}
