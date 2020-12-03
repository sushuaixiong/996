package com.fanglaojia.seth.bean;

import com.fanglaojia.seth.enums.CategoryEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Skus.
 *
 * @author ssx
 * @version 1.0.0
 * @fileName Skus.java
 * @description 商品信息
 * @date 2020 -11-23 11:24
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skus {

    /**
     * 年龄
     */
    private String age;
    
    /**
     * 
     */
    private String className;
    
/**
 * 
 */
private String myname;


    /**
     * The Sku id.
     */
    private Integer skuId;
    /**
     * The Sku price.
     */
    private Double skuPrice;
    /**
     * The Sku name.
     */
    private String skuName;
    /**
     * The Sku count.
     */
    private Integer skuCount;
    /**
     * The Total price.
     */
    private Double totalPrice;
    /**
     * The Category enum.
     */
    private CategoryEnum categoryEnum;
}
