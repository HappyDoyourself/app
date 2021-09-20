package com.sq.app.data.param1.node2;


/**
 * @Author fanht
 * @Description  环形队列
 * @Date 2021/3/17 7:15 PM
 * @Version 1.0
 */
public class CycleList {


    private Node first = null;

    public void add(int num) {
        if (num < 0 || num > 1000) {
            throw new IndexOutOfBoundsException("下标越界");
        }
        Node curNode = null;
        for (int i = 0; i < num; i++) {
            Node node = new Node(i);
            if (first == null) {
                first = node;
                first.setNext(first);
                curNode = first;
            } else {
                curNode.setNext(node);
                node.setNext(first);
                curNode = curNode.getNext();
            }
        }
    }

    public  void show(){
        Node empty=first;
        if(empty==null){
            System.out.println("this list is null");
            return;
        }
        do{
            System.out.printf("this is %dth data\n",empty.getData());
            empty=empty.getNext();
        }while(empty!=first);
    }


    public static void main(String[] args) {
        CycleList cycleList = new CycleList();
        cycleList.add(8);
        cycleList.show();
    }
}
