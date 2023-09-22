package org.example.customecollectionclass.linkedlist;

public class LinkedList {
Node head;
Node tail;



public void printList()
{
	Node current=head;
	while(current!=null)
	{
		System.out.print(current.data+"-->");
		current=current.next;
	}
	System.out.println("null");
}
public int size()
{
	
	if(head==null)
	{
		return 0;
	}
	int count=0;
	Node current=head;
	
	while(current!=null)
	{
		current=current.next;
		count++;
	}
	return count;
}
public Node addFirst(int data)
{
	Node node=new Node(data);
	node.next=head;
	head=node;
	return node;
}

public Node addLast(int data)
{
	Node node=new Node(data);

	if(head==null)
	{
		
		head=node;
		return node;
	}
	Node current=head;
	while(current.next!=null)
	{
		current=current.next;
	}
	current.next=node;
	return node;
}

public void insertAtPositionOrLast(int position,int data)
{
	Node node=new Node(data);
	if(position==1)
	{
		node.next=head;
		head=node;
	
	return ;
	}
	if(size()>position)
	{
		System.out.println("invalid postion");
		return;
	}
	Node previous=head;
	int count=1;
	while(count<position-1)
	{
		previous=previous.next;
		count++;
	}
	Node current=previous.next;
	node.next=current;
	previous.next=node;
}

public Node deleteFirst()
{
	if(head==null)
	{
		return null;
	}
	
	Node temp=head;
	head=head.next;
	temp.next=null;
			
	
	return temp;
	
}

public void deleteAtGivenPosition(int pos)
{
	if(pos==1)
	{
		head=head.next;
		return ;
	}
	//1-2-3-4-8-9-null
	Node  previous=head;
	int count=1;
	while(count<pos-1)
	{
		previous=previous.next;
		count++;
	}
	Node current=previous.next;
	previous.next=current.next;
	
}
public int searchByValue(int data)
{
	if(head.data==data)
	{
		return  head.data;
	}
	Node current=head;
	int find=0;
	while(current!=null)
	{
		if(current.data==data)
		{
			find= current.data;
		}
		current=current.next;
	}
	
	return find;
}

public Node reverseLinkedList(Node node)
{
	//1-2-3-4-5-6--null
	if(node==null)
	{
		return node;
	}
	Node current =node;
	Node previous=null;
	Node next=null;
	while(current!=null)
	{
		next=current.next;
		current.next=previous;
		previous=current;
		current=next;
		
		
	}
	node=previous;
	return node;
}


public Node  getMidNode()
{
	if(head==null)
		return null;
	Node slowPtr=head;
	Node fastPtr=head;
	while(fastPtr!=null && fastPtr.next!=null)
	{
		slowPtr=slowPtr.next;
		fastPtr=fastPtr.next.next;
	}
	return slowPtr;
}

public Node getMidNode2()
{
	if(head==null)
		return null;
	Node temp=head;
	Node mid=head;
	
	int count=1;
	while(temp!=null)
	{
		temp=temp.next;
		++count;
		if(count%2==1)
		{
			mid=mid.next;
		}
	}
	return mid;
}

public Node nthNodeFromLast(int n)
{
	if(head==null)
	{
		return null;
	}
	
	Node temp=head;
	int count=1;
	while(temp.next!=null)
	{
		temp=temp.next;
		count++;
	}
	if(count<n)
	return null;
	temp=head;
	for(int i=1;i<count-n+1;i++)
	{
		temp=temp.next;
	}
	return temp;
}

public Node nthNodeFromLast2(int n)
{
	if(head==null)
	{
		return null;
	}
	
	Node firstPtr=head;
	Node mainPtr=head;
	int count=1;
	while(count<n)
	{
		firstPtr=firstPtr.next;
		count++;
	}
	while(firstPtr.next!=null)
	{
		firstPtr=firstPtr.next;
		mainPtr=mainPtr.next;
	}
	return mainPtr;
}

public void removeDuplicateInsorted()
{
	if(head==null)
		return;
	Node current=head;
	
	while(current!=null && current.next!=null)
	{
		if(current.data==current.next.data)
		{
			current.next=current.next.next;
		}
		else
		{
			current=current.next;
		}
	}
}

public void insertNodeInSortedLinkedList(int data)
{
	//5-9-8-7
	Node newNode=new Node(data);
	if(head==null||head.data>newNode.data)
	{
		
		newNode.next=head;
		head=newNode;
		return ;
	}
	
	Node current=head;
	Node temp=null;
	while(current!=null && current.data<newNode.data)
	{
		temp=current;
		current=current.next;
		
	}
	newNode.next=current;
	temp.next=newNode;
}

public static void main(String str[])
{
	LinkedList list=new LinkedList();
	
	//list.head=new Node(10);
	//Node first=new Node(11);
	
	
	//Node second=new Node(12);
	//Node third=new Node(13);
	//Node fourth=new Node(14);
	//list.head.next=first;
	//first.next=second;
	//second.next=third;
	//third.next=fourth;
	
	list.addFirst(11);
	
	list.addFirst(11);
	list.addFirst(10);
	list.addFirst(9);
	list.addFirst(9);
	list.addFirst(8);
	list.addFirst(7);
	list.addFirst(6);
	list.addFirst(6);
	list.addFirst(5);
	
	list.printList();
	
	//Node mid=list.nthNodeFromLast2(3);
	//System.out.println("mid::"+mid.data);
	list.insertNodeInSortedLinkedList(2);
	list.printList();
	System.out.println("size is:"+list.size());
	
}
}
