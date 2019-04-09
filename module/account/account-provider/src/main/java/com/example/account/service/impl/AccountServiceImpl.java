package com.example.account.service.impl;

import com.example.account.service.AccountService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyu
 * 2019/04/09 09:53
 */
@RestController
public class AccountServiceImpl implements AccountService {
    @Override
    public String hello(String name) {
        return "hello " + name + " from account!";
    }
}
