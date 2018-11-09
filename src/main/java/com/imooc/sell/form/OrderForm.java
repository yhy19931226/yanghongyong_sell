package com.imooc.sell.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class OrderForm {

    /**买家名称*/
    @NotEmpty(message = "买家名称不能为空")
    private String name;
    /**买家电话*/
    @NotEmpty(message = "买家电话不能为空")
    private String phone;
    /**买家地址*/
    @NotEmpty(message = "买家地址不能为空")
    private String address;
    /**买家微信openid*/
    @NotEmpty(message = "买家微信openid不能为空")
    private String openid;
    /**买家购物车*/
    @NotEmpty(message = "购物车不能为空")
    private String items;
}
