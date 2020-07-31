package com.example.bankb.web;

import com.example.bankb.biz.AccountBService;
import com.example.bankb.dto.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountBController {

    @Autowired
    AccountBService accountBService;

    @GetMapping("/transferAccountsB")
    public Result transferAccounts(@RequestParam int num) {
        return accountBService.updateAccount(num)>0?Result.success("转账成功"):Result.error("转账失败");
    }

}
