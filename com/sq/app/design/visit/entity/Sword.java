package com.sq.app.design.visit.entity;

import lombok.Data;

/**
 * @Author fanht
 * @Description ε
 * @Date 2020/11/20 δΈε11:33
 * @Version 1.0
 */
@Data
public class Sword {

    public Sword(Double damage) {
        this.damage = damage;
    }

    private Double damage;
}
