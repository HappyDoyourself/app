package com.sq.app.data.param1.queue;

/**
 * @Author fanht
 * @Description  环形队列
 * @Date 2021/3/17 9:08 PM
 * @Version 1.0
 */
public class ArrayCycleQueue {

    /**数组*/
    private Integer arr[];
    /**最大值*/
    private Integer maxSize;
    /**加法*/
    private Integer add;
    /**减法*/
    private Integer sub;

    public ArrayCycleQueue(Integer[] arr, Integer maxSize, Integer add, Integer sub) {
        this.arr = arr;
        this.maxSize = maxSize;
        this.add = 0;
        this.sub = 0;
    }

    private boolean isEmpty(){
        if(add.equals(sub)){
            //表明是空的
            return true;
        }
        return false;
    }

    private boolean isFull(){
        if(arr.length>= maxSize-1){
            return true;
        }
        return false;
    }

    private void  push(int data){
        if(isFull()){
            System.out.println("队列已满");
            return;
        }
        add++;
        arr[add] = data;
    }

    private void pop(){
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }
        sub++;
        System.out.println(arr[sub]);
    }
}
