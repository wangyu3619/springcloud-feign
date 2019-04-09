package com.example.user.controller;

import com.example.account.service.rpc.AccountService;
import com.microservice.base.pojo.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyu
 * 2019/04/09 10:58
 */
@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    AccountService accountService;

    @GetMapping("/test")
    public JsonResult test() {
        JsonResult rpcResult = accountService.hello("test");
        logger.info("rpc result:{}", rpcResult);
        return rpcResult;
    }
}
