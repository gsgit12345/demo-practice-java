package org.example.datastructure.stack;

import org.example.datastructure.linkedlist.LinkedList;

public class CustomeStackUsingLinkedList {

    @Override
    public String toString() {
        return "CustomeStackUsingLinkedList{" +
                "linkedList=" + linkedList.toString() +
                '}';
    }

    LinkedList<Integer> linkedList;

    public CustomeStackUsingLinkedList(LinkedList<Integer> linkedList) {
        this.linkedList = linkedList;
    }

    public int getSize() {
        return linkedList.getSize();
    }

    public void push(int value) {
        linkedList.addAtFirst(value);
    }

    public int top() {
        if (linkedList.getSize() == 0) {
            System.out.println("stack is underflow");
            return -1;
        } else {
            return linkedList.getFirstNode();
        }
    }

    public int pop() {
        if (linkedList.getSize() == 0) {
            System.out.println("stack is underflow");
            return -1;
        } else {
            return linkedList.removeFirst();
        }
    }
}
