package com.hgc.graduate.core;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {

    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result genSuccessResult() {
        return Result.success();
    }

    public static <T> Result<T> genSuccessResult(T data) {
        return Result.success(data, DEFAULT_SUCCESS_MESSAGE);
    }
}
