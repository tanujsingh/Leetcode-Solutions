package com.java.leetcode.solutions.linkedlist;

import com.java.leetcode.solutions.commons.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode(0);
        ListNode curr = sentinel;

        int carry = 0;

        while(l1 != null || l2 != null) {
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            curr.next = new ListNode(sum%10);
            carry = sum/10;
            curr = curr.next;
        }

        if(carry != 0) {
            curr.next = new ListNode(carry);
            curr = curr.next;
        }

        return sentinel.next;
    }
}
