package org.example.datastructure.linkedlist;

public class Node {
    int data;
  public  Node next;
    public Node(int val, Node next)
    {
        this.data = val;
        this.next = next;
    }
    public Node() {}
    public Node(int val) { this.data = val; }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
