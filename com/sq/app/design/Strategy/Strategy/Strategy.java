package com.sq.app.design.Strategy.Strategy;

/**
 * @Author fanht
 * @Description  策略模式
 * @Date 2020/11/20 下午5:16
 * @Version 1.0
 */
public interface Strategy {
    /**计算开始地点到结束地点时长*/
    Long execute(Long startAddr, Long endAddr);


}
