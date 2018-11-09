package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    OrderDetailRepository repository;

    private static final String ORDERID = "9722f82c8cf64bfa9d879cd5b9324606";

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId(UUID.randomUUID().toString().replace("-",""));
        orderDetail.setProductIcon("www.xiaomi.com");
        orderDetail.setProductId(UUID.randomUUID().toString().replace("-",""));
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(5.5));
        orderDetail.setOrderId(UUID.randomUUID().toString().replace("-",""));
        orderDetail.setProductQuantity(10);

        OrderDetail detail = repository.save(orderDetail);
        Assert.assertEquals("www.baidu.com",detail.getProductIcon());
    }

    @Test
    public void findByOrderIdTest(){
        List<OrderDetail> orderDetailList = repository.findByOrderId(ORDERID);
        Assert.assertNotEquals(0,orderDetailList.size());
    }

}