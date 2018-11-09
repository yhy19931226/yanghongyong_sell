package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("a4dc6f9c9015430a8218aabd81594a38");
        Assert.assertEquals("a4dc6f9c9015430a8218aabd81594a38",productInfo.getProductId());
    }

    @Test
    public void findAll() {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findAll1() {
        PageRequest request = PageRequest.of(0,2);
        Page<ProductInfo> list = productService.findAll(request);
        System.out.println(list.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId(UUID.randomUUID().toString().replace("-", ""));
        productInfo.setProductName("手抓饼");
        productInfo.setProductPrice(new BigDecimal(4.5));
        productInfo.setProductStock(50);
        productInfo.setProductDescription("很好吃哟");
        productInfo.setProductStatus(0);
        productInfo.setProductIcon("www.baidu.com");
        productInfo.setCategoryType(3);
        ProductInfo result = productService.save(productInfo);
        Assert.assertNotEquals(null,result);
    }
}