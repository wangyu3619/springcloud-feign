package com.example.account.service.rpc.impl;

import com.example.account.service.AccountService;
import com.microservice.base.pojo.JsonResult;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyu
 * 2019/04/09 09:53
 */
@RestController
public class AccountServiceImpl implements AccountService {
    @Override
    public JsonResult hello(String name) {
        return JsonResult.ok("hello " + name + " from account!");
    }
}
