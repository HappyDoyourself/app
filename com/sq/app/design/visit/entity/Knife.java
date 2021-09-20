package com.sq.app.design.visit.entity;

import lombok.Data;

/**
 * @Author fanht
 * @Description 刀
 * @Date 2020/11/20 上午11:32
 * @Version 1.0
 */
@Data

public class Knife {

    public Knife(Double damage) {
        this.damage = damage;
    }

    private Double damage;
}
