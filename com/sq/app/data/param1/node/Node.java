package com.sq.app.data.param1.node;

/**
 * @Author fanht
 * @Description 单链表
 * @Date 2021/3/17 10:20 AM
 * @Version 1.0
 */
public class Node<E> {

    Node<E> next;

    E element;

    public Node(Node<E> next, E element) {
        this.next = next;
        this.element = element;
    }
}
