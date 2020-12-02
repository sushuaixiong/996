package com.fanglaojia.seth.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ssx
 * @version 1.0.0
 * @fileName CategoryEnum.java
 * @description ?????????
 * @date 2020-11-23 12:20
 * @since 1.0.0
 */
@AllArgsConstructor
@Getter
public enum CategoryEnum {

    /**
     * Books category enum.
     */
    BOOKS(10000, "?????"),

    /**
     * Clothes category enum.
     */
    CLOTHES(20000, "?��???"),

    /**
     * Foods category enum.
     */
    FOODS(30000, "????"),

    /**
     * Electronics category enum.
     */
    ELECTRONICS(40000, "??????"),
    ELECTRONIC(50000, "时间段"),
    ;

    /**
     * The Code.
     */
    private Integer code;

    /**
     * The Name.
     */
    private String name;

}

