package com.example.banka.dao;

import com.example.banka.dao.domain.AccountA;
import com.example.banka.dao.mapper.AccountAMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountADao {

    @Autowired
    AccountAMapper accountAMapper;

    public int update(AccountA accountB) {
        return accountAMapper.updateById(accountB);
    }

    public AccountA query(String id) {
        return accountAMapper.selectById(id);
    }

}
