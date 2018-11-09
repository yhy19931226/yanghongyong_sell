package com.imooc.sell.VO;

import lombok.Data;

import java.util.List;

/**
 * http请求返回的最外层对象
 */
@Data
public class ResultVO<T> {

    /**http请求返回的状态码*/
    private Integer code;
    /**http请求返回的信息*/
    private String message;
    /**http请求返回的数据*/
    private T data;
}
