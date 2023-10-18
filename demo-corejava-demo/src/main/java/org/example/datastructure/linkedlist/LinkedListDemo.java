package org.example.datastructure.linkedlist;

public class LinkedListDemo {
    public static void main(String str[])
    {
        LinkedList linkedList=new LinkedList();
        //linkedList.addAtFirst(40);
       // linkedList.displayLinkedList();
        linkedList.addLast(10);
        linkedList.addLast(0);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(50);
        linkedList.addLast(80);

        // System.out.println(linkedList);

       // linkedList.displayLinkedList();
      //  linkedList.removeFirst();
      //  linkedList.addAtFirst(40);
    //  int value=  linkedList.getFirstNode();
      //  int last=  linkedList.getLastNode();
        //int particular=  linkedList.getAtParticularIndex(2);

      //System.out.println("first value::"+value+":last node:"+last+":value at particular:"+particular);
        //linkedList.addAtParticularIndex(3,100);
        //linkedList.removeLastNode();
       // linkedList.removeAtParticularIndex(3);

        //40,10,0,100,20,30,
      //  linkedList.reverseLinkedList();
      //int data=  linkedList.removeFirst();
        //System.out.println("data is::"+data);
      int data=  linkedList.findMidelementInLinkedList();
        System.out.println("data is::"+data);
        linkedList.displayLinkedList();
    }
}
