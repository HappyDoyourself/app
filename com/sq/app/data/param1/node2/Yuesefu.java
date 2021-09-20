package com.sq.app.data.param1.node2;

/**
 * @Author fanht
 * @Description  yuesefu最后仅能活一个人
 * @Date 2021/3/17 7:46 PM
 * @Version 1.0
 */
public class Yuesefu {

    private Node first = null;

    private void onlyOne(int num,int k){
        Node head = first;
        Node tail = first;

        //todo 没明白  表明tail是head的前一个节点
        while (tail.getNext()!= head){
            tail = tail.getNext();
        }

        //head指向第一个报数的点 tail指向head的前面一个
        for (int i = 0;i<num;i++){
            tail = tail.getNext();
            head = head.getNext();
        }

        while (head != tail){

            for (int i = 0;i<k-1;i++){
                tail = tail.getNext();
                head = head.getNext();

            }

            System.out.println("the" + head.getData()+ "out");
            head = head.getNext();
            tail.setNext(head);
        }

        System.out.println("the" + head.getData() + "is the only one");
    }


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

    public static void main(String[] args) {


        Yuesefu yuesefu = new Yuesefu();
        yuesefu.add(6);
        yuesefu.onlyOne(1,2);
    }
}
