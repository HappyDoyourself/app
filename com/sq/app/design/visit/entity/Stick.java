package com.sq.app.design.visit.entity;

import lombok.Data;

/**
 * @Author fanht
 * @Description 棍
 * @Date 2020/11/20 上午11:34
 * @Version 1.0
 */
@Data
public class Stick {
    public Stick(Double damage) {
        this.damage = damage;
    }

    private Double damage;
}
