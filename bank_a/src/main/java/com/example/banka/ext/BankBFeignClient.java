package com.example.banka.ext;

import com.example.banka.dto.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "BANK-B")
public interface BankBFeignClient {

    @RequestMapping(
            value = {"/bankb/transferAccountsB"},
            method = {RequestMethod.GET}
    )
    Result transferAccounts(@RequestParam int num);

}
