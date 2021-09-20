package com.sq.app.jdk.delay;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @Author fanht
 * @Description
 * @Date 2020/12/17 下午2:18
 * @Version 1.0
 */
public class Message1 implements Delayed{
    private int id;
    private String body;//消息体
    private long excuteTime;//执行时间


    public Message1(int id, String body, long delayTime) {
        this.id = id;
        this.body = body;
        this.excuteTime = TimeUnit.NANOSECONDS.convert(delayTime, TimeUnit.MILLISECONDS) + System.nanoTime();
    }

        @Override
    public long getDelay(TimeUnit unit) {
        return  unit.convert(this.excuteTime - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        Message1 msg = (Message1)o;
        return Integer.valueOf(this.id)>Integer.valueOf(msg.id)?1:( Integer.valueOf(this.id)<Integer.valueOf(msg.id)?-1:0);

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getExcuteTime() {
        return excuteTime;
    }

    public void setExcuteTime(long excuteTime) {
        this.excuteTime = excuteTime;
    }
}
