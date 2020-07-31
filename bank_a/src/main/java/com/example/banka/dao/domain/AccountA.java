package com.example.banka.dao.domain;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName(value ="account_a")
public class AccountA {

    @TableId(value = "id" )
    private String id;

    @TableField("account")
    private Integer account;

}
