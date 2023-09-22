package org.example.customecollectionclass.linkedlist;

public class Node {

	int data;
	Node next;
	
	public Node(int data)
	{
		this.data=data;
		next=null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}
