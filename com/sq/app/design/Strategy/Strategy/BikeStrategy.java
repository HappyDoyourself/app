package com.sq.app.design.Strategy.Strategy;

/**
 * @Author fanht
 * @Description
 * @Date 2020/11/20 下午5:21
 * @Version 1.0
 */
public class BikeStrategy implements Strategy{
    @Override
    public Long execute(Long startAddr, Long endAddr) {
        return Math.abs(endAddr-startAddr)*5;
    }
}
