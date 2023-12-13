package org.example.leetcode.linklist;

import org.example.datastructure.linkedlist.Node;

public class LinkList {
    int value;
    LinkList tail;
  //  LinkList head;
int size=0;
    public LinkList() {
    }

    public LinkList(int value) {
        this.value = value;
    }

    public LinkList(int value, LinkList tail) {
        this.value = value;
        this.tail = tail;
    }
/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */


    public String toString() {
        return "Node{" +
                "data=" + value +
                ", next=" + tail +
                '}';
    }
    public static LinkList addTwoNode(LinkList node1, LinkList node2) {
        LinkList result = new LinkList(0);
        LinkList ptr = result;
        int carry = 0;
        while (node1 != null || node2 != null) {
            int sum = 0 + carry;
            if (node1 != null) {
                sum = sum + node1.value;
                node1 = node1.tail;
            }
            if (node2 != null) {
                sum = sum + node2.value;
                node2 = node2.tail;

            }
            carry = sum / 10;
            sum = sum % 10;
            ptr.tail = new LinkList(sum);
            ptr = ptr.tail;
        }
        if (carry == 1) {
            ptr.tail = new LinkList(1);
        }
        return result.tail;
    }
    public static void main(String str[])
    {
        LinkList node1 = new LinkList(2);
        node1.tail = new LinkList(4);
        node1.tail.tail = new LinkList(3);

        LinkList head2 = new LinkList(5);
        head2.tail = new LinkList(6);
        head2.tail.tail = new LinkList(4);
        LinkList result=addTwoNode(node1,head2);
System.out.println(node1.toString());
        System.out.println(result.toString());



    }
}
