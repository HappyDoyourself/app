package com.sq.app.design.Strategy.Strategy;

/**
 * @Author fanht
 * @Description 上下文
 * @Date 2020/11/20 下午5:22
 * @Version 1.0
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Long execute(Long a, Long b){
        return strategy.execute(a,b);
    }
}
