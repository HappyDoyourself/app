package com.sq.app.data.param1.node2;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/17 6:40 PM
 * @Version 1.0
 */
public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
