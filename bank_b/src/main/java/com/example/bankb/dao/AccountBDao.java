package com.example.bankb.dao;

import com.example.bankb.dao.domain.AccountB;
import com.example.bankb.dao.mapper.AccountBMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountBDao {

    @Autowired
    AccountBMapper accountBMapper;

    public int update(AccountB accountB) {
        return accountBMapper.updateById(accountB);
    }

    public AccountB query(String id) {
        return accountBMapper.selectById(id);
    }

}
