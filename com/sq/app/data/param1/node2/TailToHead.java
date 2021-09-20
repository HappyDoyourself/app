package com.sq.app.data.param1.node2;

import org.apache.ibatis.jdbc.Null;

import java.util.ArrayList;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/19 3:36 PM
 * @Version 1.0
 */
public class TailToHead {


    public ArrayList add(Node node){

        ArrayList<Integer> arrayList = new ArrayList();

        if(node == null){
             throw new NullPointerException("输入为空");
         }


         Node tail = node;
         //获取尾节点
         while (tail != null){
             arrayList.add(0,tail.getData());

             tail = tail.getNext();
         }


          return arrayList;
    }
}
