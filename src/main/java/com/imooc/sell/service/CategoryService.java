package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 */
public interface CategoryService {

    /**根据categoryId查询类目信息*/
    ProductCategory findOne(Integer categoryId);

    /**查询所以的类目信息*/
    List<ProductCategory> findAll();

    /**根据类目编号查询类目信息*/
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**保存类目信息*/
    ProductCategory save(ProductCategory productCategory);
}
