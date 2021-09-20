package com.sq.app.lamb;

/**
 * @Author fanht
 * @Description
 * @Date 2020/8/4 上午10:59
 * @Version 1.0
 */

public class Product {

    private String color;

    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Product(String color) {
        this.color = color;
    }

    public Product(){

    }
}
