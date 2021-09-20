package com.sq.app.data.param1;

import java.util.ArrayList;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/16 8:42 PM
 * @Version 1.0
 */
public class ArrayData {

    private static ArrayList<Integer> list(ListNode listNode){

        if(listNode == null){
            return new ArrayList<>();
        }

        ListNode head = listNode;

        ListNode cur = head.next;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = head;
            head = cur;
            cur = temp;
        }

        listNode.next = null;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head != null){
            arrayList.add(head.val);
            head = head.next;
        }

        return arrayList;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        ListNode listNode1 = new ListNode(3);
        ArrayList<Integer> arrayList = list(listNode);
        System.out.println(arrayList);
    }
}
