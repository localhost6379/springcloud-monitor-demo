package cn.king.fallback;

import cn.king.client.UserServiceClient;
import cn.king.domain.entity.User;
import cn.king.domain.result.DataResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @author: wjl@king.cn
 * @time: 2021/8/26 2:27
 * @version: 1.0.0
 * @description:
 * @why:
 */
@Slf4j
@Component
public class UserServiceClientFallback implements UserServiceClient {

    @Override
    public DataResult<User> findById(String id) {
        log.error("cn.king.fallback.UserServiceClientFallback.findById 熔断！");
        return this.fallback();
    }

    private DataResult fallback() {
        return DataResult.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), "熔断！");
    }

}
