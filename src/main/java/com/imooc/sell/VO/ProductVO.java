package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品（包含类目）
 */
@Data
public class ProductVO {

    /**类目名称*/
    @JsonProperty("name")
    private String categoryName;
    /**类目编号*/
    @JsonProperty("type")
    private Integer categoryType;
    /**类目的集合*/
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
