package org.example.datastructure.linkedlist;

public class Node {
    int data;
    Node next;
    Node(int val, Node next)
    {
        this.data = val;
        this.next = next;
    }
    Node() {}
    Node(int val) { this.data = val; }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
