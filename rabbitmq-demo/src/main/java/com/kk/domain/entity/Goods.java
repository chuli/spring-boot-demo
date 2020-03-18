package com.kk.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: kk
 * @Date: 2020-03-12 15:12
 */

public class Goods implements Serializable {

    private static final long serialVersionUID = -1;

    private Long goodsId;
    private String goodsName;
    private String goodsIntroduce;
    private BigDecimal goodsPrice;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsIntroduce() {
        return goodsIntroduce;
    }

    public void setGoodsIntroduce(String goodsIntroduce) {
        this.goodsIntroduce = goodsIntroduce;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsIntroduce='" + goodsIntroduce + '\'' +
                ", goodsPrice=" + goodsPrice +
                '}';
    }
}
