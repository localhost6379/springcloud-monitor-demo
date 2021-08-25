package cn.king;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: wjl@king.cn
 * @time: 2021/8/26 1:03
 * @version: 1.0.0
 * @description:
 * @why:
 */
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class AdminSecurityServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(AdminSecurityServiceApp.class, args);
    }

}
