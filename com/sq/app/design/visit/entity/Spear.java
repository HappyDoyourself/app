package com.sq.app.design.visit.entity;

import lombok.Data;

/**
 * @Author fanht
 * @Description η
 * @Date 2020/11/20 δΈε11:34
 * @Version 1.0
 */
@Data
public class Spear {

    public Spear(Double damage) {
        this.damage = damage;
    }

    private Double damage;
}
