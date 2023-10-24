package org.example.datastructure.linkedlist;


public class LinkedList<E> {
    Node head;
    Node tail;
    int Size;

    public LinkedList() {
        head = new Node();
        tail = new Node();
    }

    public void addLast(int value) {
        Node temp = new Node();
        temp.data = value;
        temp.next = null;
        if (Size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        Size++;
    }

    public int getSize() {
        return Size;
    }

    public void displayLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;

        }
    }

    public int removeFirst() {
        int data = 0;
        if (getSize() == 0) {
            System.out.println("List is Emty");
        } else if (getSize() == 1) {
            head = tail = null;
            Size = 0;
        } else {
            data = head.data;
            head = head.next;
            Size--;
        }
        return data;
    }

    public int getFirstNode() {
        if (Size == 0) {
            System.out.println("List is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public int getLastNode() {
        if (Size == 0) {
            System.out.println("List is empty");
            return -1;
        } else {
            return tail.data;
        }
    }

    public int getAtParticularIndex(int index) {
        Node temp = head;
        if (Size == 0 || index > Size) {
            System.out.println("List is empty or Invalid index");
            return -1;
        } else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void addAtFirst(int value) {

        Node temp = new Node();
        temp.data = value;
        temp.next = head;
        head = temp;
        if (Size == 0) {
            tail = temp;
        }
        Size++;
    }

    public void addAtParticularIndex(int index, int value) {
        if (index < 0 || index > Size) {
            System.out.println("Illegal argument.Index is not available");

        } else if (index == 0) {
            addLast(value);
        } else if (index == Size) {
            addLast(value);
        } else {
            Node node = new Node();
            node.data = value;
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            Size++;
        }

    }

    public void removeLastNode() {
        if (getSize() == 0) {
            System.out.println("List is Emty");
        } else if (getSize() == 1) {
            head = tail = null;
            Size = 0;
        } else {
            Node temp = head;
            for (int i = 0; i < Size - 2; i++) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;

            Size--;
        }
    }

    public void removeAtParticularIndex(int index) {
        if (index < 0 || index > Size) {
            System.out.println("invalid argument");
        } else if (index == 0) {
            removeFirst();
        } else if (index == Size) {
            removeLastNode();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            Size--;
        }
    }

    private Node getNodeAt(int index) {
        Node temp = head;
        if (Size == 0 || index > Size) {
            System.out.println("List is empty or Invalid index");

        } else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

        }
        return temp;
    }

    public void reverseLinkedList() {
        int lefts = 0;
        int rigts = Size - 1;
        while (lefts < rigts) {
            Node left = getNodeAt(lefts);
            Node right = getNodeAt(rigts);
            int temp = left.data;

            left.data = right.data;
            right.data = temp;
            lefts++;
            rigts--;
        }
    }

    public int findMidelementInLinkedList() {
        //in  single traversal and without using size property
        int data = 0;
        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        data = slowPointer.data;

        return data;
    }

    public LinkedList<Integer> mergeTwoSortedLinkedList(LinkedList<Integer> linkedList1, LinkedList<Integer> linkedList2) {
        LinkedList<Integer> response = new LinkedList<>();
        Node first = linkedList1.head;
        Node second = linkedList2.head;
        Node temp = new Node();

        while (first != null && second != null) {
            if (first.data < second.data) {
                int data = first.data;
                response.addLast(data);
                first = first.next;

            } else {
                int data = second.data;
                response.addLast(data);
                second = second.next;

            }
        }
        while (first != null) {
            int data = first.data;
            response.addLast(data);
            first = first.next;
        }
        while (second != null) {
            int data = second.data;
            response.addLast(data);
            second = second.next;
        }

        Size++;
        return response;
    }

    public Node findMid(Node head, Node tail) {
        Node slow = head;
        Node fast = head;
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public LinkedList mergeSortLinkedList(Node head, Node tail) {
        if (head == tail) {
            LinkedList list = new LinkedList();
            list.addLast(head.data);
            return list;
        }
        LinkedList result = null;
        Node mid = findMid(head, tail);
        LinkedList firstHalf = mergeSortLinkedList(head, mid);
        LinkedList secondHalf = mergeSortLinkedList(mid.next, tail);

        result = mergeTwoSortedLinkedList(firstHalf, secondHalf);

        return result;
    }

    public LinkedList<Integer> mergeTwoSortedLinkedListWithoutAddLastMethod(LinkedList<Integer> linkedList1, LinkedList<Integer> linkedList2) {

        Node first = linkedList1.head;
        Node second = linkedList1.head;

        LinkedList<Integer> mergedHead = new LinkedList<>();
        if (linkedList1.head == null) {
            return linkedList2;
        }
        if (linkedList2.head == null) {
            return linkedList1;
        }

        while (first != null && second != null) {
            LinkedList temp = new LinkedList();
            if (first.data < second.data) {
                mergedHead.head.next = first;
                first = first.next;
            } else {
                mergedHead.head.next = second;

                second = second.next;
            }
            //mergedTail.head.next=temp.tail;
            // mergedTail.tail=temp.tail;
        }

        return mergedHead;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", Size=" + Size +
                '}';
    }
}
