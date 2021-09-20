package com.sq.app.jdk.delay;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

/**
 * @Author fanht
 * @Description
 * @Date 2020/12/17 下午2:23
 * @Version 1.0
 */
public class Consumer implements Runnable{

    //延时队列
    private DelayQueue queue;

    public Consumer(DelayQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Message1 message1 = (Message1) queue.take();
                System.out.println("消费消息ID=="+ message1.getId() + "消费消息内容==" + message1.getBody());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
