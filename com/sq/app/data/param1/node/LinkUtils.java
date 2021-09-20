package com.sq.app.data.param1.node;

/**
 * @Author fanht
 * @Description
 * @Date 2021/4/17 8:33 PM
 * @Version 1.0
 */
public class LinkUtils<E> {


    private int count;

    private Node<E> head;


    //查询
    public Node<E> query(int n){
        if(n<0 || n>count){
            throw new RuntimeException("下标越界");
        }
        Node<E> queryNode = head;

        for(int i = 0;i<n;i++){
            queryNode = head.next;
        }
        return queryNode;
    }

    //添加
    public void add(E element,int num){
        if(head == null){
            Node<E> newNode = new Node<>(null,element);
            head = newNode;
        }else {
            Node<E> node = query(num-1);
            node.next = new Node<>(node.next,element);
        }
        count++;
    }
    //添加最后一个元素
    public void addLast(E element){
        add(element,count);
    }

    //删除
    public E delete(int index){
        if(index<0||index>count){
            throw new RuntimeException("运行时异常");
        }
        if(index == 0){
            head = head.next;
            count--;
            return query(0).element;
        }else {
            //找到前面的元素，找到后指向后面的后面
            Node<E> deleteNode = query(index-1);
            deleteNode.next = deleteNode.next.next;
            count--;
            return deleteNode.element;
        }
    }

    //更改
    public E update(int index,E element){

        if(index<0 || index>count){
            throw new RuntimeException("下标越界");
        }

        Node<E> node = query(index);


        E old = node.element;

        old = element;


        return old;
    }

    //输出str



}
