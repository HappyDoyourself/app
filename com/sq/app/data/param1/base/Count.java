package com.sq.app.data.param1.base;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author fanht
 * @Description
 * @Date 2021/5/13 9:39 下午
 * @Version 1.0
 */
public class Count {

    public static void main(String[] args) {

        ListNode head =null,tail = null;
        for(int k = 0;k<10;k++){
            if(head == null){
                head = tail = new ListNode(k);
            }else{
                tail.next = new ListNode(k);
                tail = tail.next;
            }
        }

        ListNode l1 = new ListNode(4);
        l1.next = new ListNode(5);
        ListNode l11= l1.next;
        l11.next = new ListNode(6);
       // ListNode l111= l11.next;
        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(4);
        ListNode l22 = l2.next;
        l22.next = new ListNode(5);
        ListNode listNode = addTwoNumbers(l1,l2);
        System.out.println(JSONObject.toJSON(listNode));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }


    public static class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
