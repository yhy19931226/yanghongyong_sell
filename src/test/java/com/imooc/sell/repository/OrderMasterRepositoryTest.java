package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    OrderMasterRepository repository;

    private static final String OPENID = "123456abc";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId(UUID.randomUUID().toString().replace("-",""));
        orderMaster.setBuyerName("大师兄");
        orderMaster.setBuyerPhone("12345678910");
        orderMaster.setBuyerAddress("武汉青山区");
        orderMaster.setOrderAmount(new BigDecimal(3.2));
        orderMaster.setBuyerOpenid(OPENID);

        OrderMaster order = repository.save(orderMaster);
        Assert.assertEquals("123456abc",order.getBuyerOpenid());
    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest request = PageRequest.of(0, 2);
        Page<OrderMaster> list = repository.findByBuyerOpenid(OPENID, request);
        //System.out.println(list.getTotalElements());
        Assert.assertNotEquals(0,list.getSize());
    }
}