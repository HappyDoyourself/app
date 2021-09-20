package com.sq.app.data.param1.queue;

/**
 * @Author fanht
 * @Description 数组实现的循环队列
 * @Date 2021/3/19 9:41 AM
 * @Version 1.0
 */
public class ArrayCycleBetterQueue {

    /**入队*/
    private int rear;
    /**出队*/
    private int front;

    private int array[];

    private int maxSize;


    public ArrayCycleBetterQueue(int maxSize) {
        this.maxSize = maxSize+1;
        this.array = new int[maxSize];
    }

    public boolean isfull(){
        return (rear + 1) % maxSize ==front;

    }

    public boolean isEmpty(){
        return front == rear;

    }

    public void push(int data){
        if(isfull()){
            System.out.println("队列已满，无法入队");
            return;
        }
        array[rear] = data;

        System.out.println("入队成功");
        rear = (rear+1)%maxSize;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }
        System.out.println("队列出队");
        front = (front+1)%maxSize;
    }


    public static void main(String[] args) {
        ArrayCycleBetterQueue queue = new ArrayCycleBetterQueue(5);
        for(int i =0;i<5;i++){
            queue.push(i);
        }

        queue.push(1);

        for(int i= 0;i<5;i++){
            queue.pop();
        }


        queue.pop();


    }
}
