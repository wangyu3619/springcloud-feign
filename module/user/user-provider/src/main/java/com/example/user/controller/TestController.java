package com.example.user.controller;

import com.example.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyu
 * 2019/04/09 10:58
 */
@RestController
public class TestController {

    @Autowired
    AccountService accountService;

    @GetMapping("/test")
    public String test() {
        return accountService.hello("hh");
    }
}
