package com.example.bankb.biz;

import com.example.bankb.dao.AccountBDao;
import com.example.bankb.dao.domain.AccountB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountBServiceImpl implements AccountBService {

    @Autowired
    AccountBDao accountBDao;

    @Override
    public int updateAccount(int num) {

        AccountB account = accountBDao.query("123");

        account.setAccount(account.getAccount() + num);

        return accountBDao.update(account);
    }
}
