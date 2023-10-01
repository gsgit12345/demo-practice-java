package org.example.datastructure.stack;

import org.example.datastructure.linkedlist.LinkedList;

public class StackTest {
    public static void main(String str[])
    {
        LinkedList<Integer>  linkedList=new LinkedList<>();
        CustomeStackUsingLinkedList stackUsingLinkedList=new CustomeStackUsingLinkedList(linkedList);

        stackUsingLinkedList.push(100);
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(200);
        stackUsingLinkedList.push(300);
        stackUsingLinkedList.push(500);
        stackUsingLinkedList.push(600);

        System.out.println("size is the :"+stackUsingLinkedList.getSize()+":top of the element::"+stackUsingLinkedList.top());

        stackUsingLinkedList.pop();
        System.out.println("size is the :"+stackUsingLinkedList.getSize()+":top of the element::"+stackUsingLinkedList.top());


    }
}
