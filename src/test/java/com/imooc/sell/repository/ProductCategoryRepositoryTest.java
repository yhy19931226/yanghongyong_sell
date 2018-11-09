package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    ProductCategoryRepository repository;

    @Test
    public void findOne(){
//        List<ProductCategory> list = repository.findAll();
//        System.out.println(list.size());
        Optional<ProductCategory> productCategory = repository.findById(1);
        System.out.println(productCategory.get().getCategoryId());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(3);
        repository.saveAndFlush(productCategory);
    }

    @Test
    public void updateTest(){
        Optional<ProductCategory> optional = repository.findById(2);
        ProductCategory productCategory = optional.get();
        productCategory.setCategoryType(10);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2, 3, 10, 4);
        List<ProductCategory> productCategories = repository.findByCategoryTypeIn(list);
        System.out.println(productCategories.size());
    }

    @Test
    public void deleteTest(){
        Optional<ProductCategory> optional = repository.findById(2);
        ProductCategory productCategory = optional.get();
        repository.delete(productCategory);
    }

}