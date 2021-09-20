package com.sq.app.design.Strategy;

import com.sq.app.design.Strategy.Strategy.*;

/**
 * @Author fanht
 * @Description 策略模式
 * @Date 2020/11/20 下午5:14
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        //策略模式：
        Context context = new Context();
        context.setStrategy(new BikeStrategy());
        if(context.getStrategy() instanceof BikeStrategy){
            System.out.println("======使用自行车策略====");
            Strategy strategy = new BikeStrategy();
            Long result = strategy.execute(100L,500L);
            System.out.println(result);
        }
        if(context.getStrategy() instanceof BusStrategy){
            Strategy strtegy = new BusStrategy();
            strtegy.execute(100L,500L);
        }

        if(context.getStrategy()instanceof CarStrategy){
            Strategy strategy = new CarStrategy();
            strategy.execute(100L,500L);
        }
    }
}
