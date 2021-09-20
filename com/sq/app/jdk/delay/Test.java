package com.sq.app.jdk.delay;

import java.util.concurrent.DelayQueue;

/**
 * @Author fanht
 * @Description
 * @Date 2020/12/17 下午3:01
 * @Version 1.0
 */
public class Test {

    //test延迟时队列发送消息
    public static void main(String[] args) {

        System.out.println(Math.pow(1.03,30));

        /*//创建延时队列
        DelayQueue queue = new DelayQueue();
        //添加延时队列消息，m1 延时3s
        Message1 m1 = new Message1(1, "你好我是延迟队列消息1……", 3000);
        //添加延时队列消息， m2延时5s
        Message1 m2 = new Message1(2, "你好我是延迟队列消息2……", 5000);
        //添加延时队列消息， m3延时10s
        Message1 m3 = new Message1(3, "你好我是延迟队列消息3……", 10000);
        queue.offer(m1);
        queue.offer(m2);
        queue.offer(m3);
        //启动消费线程
        new Thread(new Consumer(queue)).start();*/
    }

}
