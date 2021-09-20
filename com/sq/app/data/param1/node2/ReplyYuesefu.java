package com.sq.app.data.param1.node2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/19 9:46 AM
 * @Version 1.0
 */
public class ReplyYuesefu {

    private Node first = null;

    public void  yuesefu(int num,int k){
        Node head = first;
        Node tail = first;

        while (tail.getNext() != head){
             tail = tail.getNext();
        }

        for(int t = 0;t<num;t++){
            head = head.getNext();
            tail = tail.getNext();
        }

        while (tail != head){
            for(int i = 0;i<k;i++){
                head = head.getNext();
                tail = tail.getNext();
            }
            System.out.println("移除" + head.getData()+"out");

            head = head.getNext();
            tail.setNext(head);


        }
        System.out.println("最后剩下" + head.getData());
    }


    public void add(int num){
        if(num < 0 || num>100000){
            throw new IndexOutOfBoundsException("下标越界");
        }

        /*for(int i = 0;i<num;i++){
            first = new Node(i);
            first.setNext(first);
        }*/
        Node curNode = null;
        for(int i = 0;i<num;i++){
            Node node= new Node(i);
            if(first == null){
                first = node;
                first.setNext(first);
                curNode = first;
            }else {
                curNode.setNext(node);
                node.setNext(first);
                curNode = curNode.getNext();
            }
        }

    }


    public static void main(String[] args) {
        ReplyYuesefu replyYuesefu = new ReplyYuesefu();
        replyYuesefu.add(6);
        System.out.println(JSONObject.toJSONString(replyYuesefu));
        replyYuesefu.yuesefu(1,2);
    }
}
