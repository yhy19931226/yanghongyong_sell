package com.imooc.sell.dataobject;

import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
@Table(name = "order_master")
public class OrderMaster {

    /**订单主表id*/
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /**支付状态 默认为0未支付*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    /**创建时间*/
    private Date createTime;
    /**修改时间*/
    private Date updateTime;

}
