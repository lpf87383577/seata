package com.example.banka.dto;

import lombok.Data;

@Data
public class Result<T> {

    private int code;
    private String msg;
    private T data;

    public Result() {
    }

    public static <T> Result<T> success() {
        Result<T> result = new Result();
        result.setCode(200);
        return result;
    }

    public static <T> Result<T> error() {
        Result<T> result = new Result();
        result.setCode(500);
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result();
        result.setCode(200);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> error(String msg) {
        Result<T> result = new Result();
        result.setCode(500);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> error(int code, String msg) {
        Result<T> result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
