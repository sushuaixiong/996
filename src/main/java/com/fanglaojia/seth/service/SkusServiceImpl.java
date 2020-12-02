package com.fanglaojia.seth.service;

import com.fanglaojia.seth.bean.Skus;
import com.fanglaojia.seth.enums.CategoryEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ssx
 * @version 1.0.0
 * @fileName SkusServiceImpl.java
 * @description
 * @date 2020-11-23 12:34
 * @since 1.0.0
 */
public class SkusServiceImpl implements SkusService {
    private static final List<Skus> carts = new ArrayList<Skus>() {
        {
            add(new Skus(1111, 22.0, "无人机", 1, 22.0, CategoryEnum.ELECTRONICS));
            add(new Skus(2222, 100.0, "VR一体机", 2, 200.0, CategoryEnum.ELECTRONICS));
            add(new Skus(3333, 220.0, "AIR FORCE1", 1, 220.0, CategoryEnum.CLOTHES));
            add(new Skus(3333, 72.0, "JAVA从放弃到入门", 1, 72.0, CategoryEnum.BOOKS));
        }
    };

    public static List<Skus> getCart() {
        return carts;
    }

    public static List<Skus> filterElectronicsList(List<Skus> carts) {
        List<Skus> electronicsList = new ArrayList<>();
        for (Skus cart : carts) {
            if (cart.getCategoryEnum().equals(CategoryEnum.ELECTRONICS)) {
                electronicsList.add(cart);
            }
        }
        return electronicsList;
    }

    public static List<Skus> filterSkusByCategory(List<Skus> carts, CategoryEnum categoryEnum) {
        List<Skus> electronicsList = new ArrayList<>();
        for (Skus cart : carts) {
            if (cart.getCategoryEnum().equals(categoryEnum)) {
                electronicsList.add(cart);
            }
        }
        return electronicsList;
    }
}
