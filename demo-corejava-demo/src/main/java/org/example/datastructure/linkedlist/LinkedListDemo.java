package org.example.datastructure.linkedlist;

public class LinkedListDemo {
    public static void main(String str[])
    {
        LinkedList linkedList=new LinkedList();
        //linkedList.addAtFirst(40);
       // linkedList.displayLinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);
        linkedList.addLast(60);
        LinkedList linkedList2=new LinkedList();
        linkedList2.addLast(71);
        linkedList2.addLast(71);
        linkedList2.addLast(60);
        linkedList2.addLast(60);
        linkedList2.addLast(18);
        linkedList2.addLast(18);
        linkedList2.addLast(19);
        linkedList2.addLast(15);
        linkedList2.addLast(180);
        LinkedList linkedList3=new LinkedList();
      //  linkedList3= linkedList2.mergeSortLinkedList(linkedList2.head,linkedList2.tail);
         linkedList2.removeDuplicateInSortedLinkedList();

        //LinkedList<Integer> result= linkedList3.mergeTwoSortedLinkedList(linkedList,linkedList2);
       // LinkedList<Integer> result2= linkedList3.mergeTwoSortedLinkedListWithoutAddLastMethod(linkedList,linkedList2);
        linkedList2.displayLinkedList();

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
     // int data=  linkedList.findMidelementInLinkedList();
       // System.out.println("data is::"+data);
        //linkedList.displayLinkedList();
    }
}
