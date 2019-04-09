package com.example.account.service.rpc;

import com.microservice.base.pojo.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangyu
 * 2019/04/09 09:48
 */
@FeignClient(value = "account-provider")
public interface AccountService {
    /**
     * hello feign
     *
     * @param name 参数
     * @return hello string
     */
    @GetMapping("/api/v1/user")
    JsonResult hello(@RequestParam("name") String name);
}
