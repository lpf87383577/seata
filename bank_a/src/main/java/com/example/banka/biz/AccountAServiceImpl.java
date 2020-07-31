package com.example.banka.biz;

import com.example.banka.dao.AccountADao;
import com.example.banka.dao.domain.AccountA;
import com.example.banka.dto.Result;
import com.example.banka.ext.BankBFeignClient;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountAServiceImpl implements AccountAService {

    @Autowired
    AccountADao accountADao;

    @Autowired
    BankBFeignClient bankB;

    @GlobalTransactional()
    @Override
    public int updateAccount(int num) {
        Result result = bankB.transferAccounts(num);
        if (result.getCode()!=200){
            throw new IllegalStateException("bankB异常");
        }
        AccountA account = accountADao.query("123");
        account.setAccount(account.getAccount() - num);
        if (num >= 20){
            throw new RuntimeException("转账金额过大");
        }
        return accountADao.update(account);
    }
}
