package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    /**根据商品id查询商品*/
    ProductInfo findOne(String productId);

    /**查询所以在线商品列表*/
    List<ProductInfo> findUpAll();

    /**分页查询商品列表*/
    Page<ProductInfo> findAll(Pageable pageable);

    /**保存订单信息*/
    ProductInfo save(ProductInfo productInfo);

    /**加库存*/
    void increaseStock(List<CartDTO> cartDTOList);

    /**减库存*/
    void decreaseStock(List<CartDTO> cartDTOList);
}
