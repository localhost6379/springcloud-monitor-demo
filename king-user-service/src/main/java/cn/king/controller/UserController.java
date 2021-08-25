package cn.king.controller;

import cn.king.domain.entity.User;
import cn.king.domain.result.DataResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wjl@king.cn
 * @time: 2021/8/26 2:35
 * @version: 1.0.0
 * @description:
 * @why:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public DataResult<User> findById(@PathVariable String id) {
        final User user = User.builder().id(id).username("张三").phone("10086").build();
        return user == null ? new DataResult<>(500, "系统错误") : new DataResult<>(user);
    }

}
