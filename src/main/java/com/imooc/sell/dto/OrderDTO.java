package com.imooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单详情对象，用于数据传输
 */
@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonInclude(value = JsonInclude.Include.NON_NULL) //该注解表示去掉属性为null的字段
public class OrderDTO {

    /**订单主表id*/
    private String orderId;
    /**买家名称*/
    private String buyerName;
    /**买家电话*/
    private String buyerPhone;
    /**买家地址*/
    private String buyerAddress;
    /**买家openid*/
    private String buyerOpenid;
    /**订单金额*/
    private BigDecimal orderAmount;
    /**订单状态 0代表新下单*/
    private Integer orderStatus;
    /**支付状态 默认为0未支付*/
    private Integer payStatus;
    /**创建时间*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    /**修改时间*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;
    /**订单详情表集合*/
    private List<OrderDetail> orderDetailList;
}
