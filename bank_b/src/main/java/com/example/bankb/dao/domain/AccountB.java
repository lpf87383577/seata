package com.example.bankb.dao.domain;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName(value ="account_b")
public class AccountB {

    @TableId(value = "id" )
    private String id;

    @TableField("account")
    private Integer account;

}
