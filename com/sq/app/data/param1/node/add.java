package com.sq.app.data.param1.node;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/17 10:22 AM
 * @Version 1.0
 */
public class add<E> {



    private Node<E>  first;

    private int size;


    public Node<E> find(int index){
        Node<E> node = first;

        for(int i = 0;i<index;i++){
            node = node.next;
        }
        return node;
    }


    public void add(E element,int index){
        if(index <0 || index>size){
            throw new RuntimeException("下标越界");
        }

        if(index == 0){
            first = new Node<E>(null,element);
        }else {
            Node<E> node = find(index-1);
            Node<E> next = node.next;
            node.next = new Node<>(next,element);
        }
        size++;
    }



    public static void main(String[] args) {

    }
}
