package com.example.banka.web;

import com.example.banka.biz.AccountAService;
import com.example.banka.dto.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountAController {

    @Autowired
    AccountAService accountAService;

    @GetMapping("/transferAccountsA")
    public Result transferAccounts(@RequestParam int num) {

        return accountAService.updateAccount(num)>0? Result.success("转账成功"): Result.error("转账失败");
    }

}
