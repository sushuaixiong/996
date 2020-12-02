package com.fanglaojia.seth.service;

import com.fanglaojia.seth.bean.Skus;
import com.fanglaojia.seth.enums.CategoryEnum;
import org.junit.Test;

import java.util.List;

public class SkusServiceImplTest {

    @Test
    public void filterElectronicsList() {
        List<Skus> cart = SkusServiceImpl.getCart();
        List<Skus> skuses = SkusServiceImpl.filterElectronicsList(cart);
        skuses.forEach(System.out::println);
    }


    @Test
    public void testFilterSkusByCategory() {
        List<Skus> cart = SkusServiceImpl.getCart();
        List<Skus> skuses = SkusServiceImpl.filterSkusByCategory(cart, CategoryEnum.BOOKS);
        skuses.forEach(System.out::println);
    }
}