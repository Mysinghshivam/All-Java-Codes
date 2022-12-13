//search node in the linked list

/*
public class singleListProblem {
    Node head;
    private int size;

    singleListProblem() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }


    //add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //print list
    public void printList() {
        if (head == null) {
            System.out.println("There is no node in the linked list:");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("null\n");
    }

    //search the element
    //we can do using while loop as jab tak null na aaye tab tak ok
    public void search(int searchedValue) {
        Node currNod = head;
        for (int i = 0; i < size; i++) {
            if (currNod.data == searchedValue) {
                System.out.print("index is:" + i);
                return;
            }
            currNod = currNod.next;
        }

    }

    public int sizeList() {
        return size;
    }

    public static void main(String[] args) {
        singleListProblem ll = new singleListProblem();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(8);
        ll.addFirst(3);
        ll.addFirst(7);
        ll.addFirst(5);
        ll.addFirst(1);

        ll.printList();

       System.out.println(ll.sizeList());

        ll.search(7);
    }
}
*/

import java.util.Scanner;

//Delete all nodes which is greater the 25
public class singleListProblem {
    Node head;
    private int size;

    singleListProblem() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    //print
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("null\n");
    }


    //delete greater than 25 data
    public void deleteNodesGreaterThen_25() {
        if (head == null) {
            System.out.println("there is no node in the list:");
            return;
        }
        if (head.next == null && head.data > 25) {
            head = null;
            return;
        }
        int i = 0;
        Node currNode = head;
        Node previousNode = head;
        while (currNode != null) {
            if (currNode.data > 25) {
                previousNode.next = currNode.next;
            }

            currNode = currNode.next;

            previousNode = previousNode.next;
        }
    }

    public static void main(String[] args) {
        singleListProblem ll = new singleListProblem();
        ll.addLast(26);
        ll.addLast(10);
        ll.addLast(30);
        ll.addLast(50);
        ll.addLast(5);
        ll.printList();


        ll.deleteNodesGreaterThen_25();
        ll.printList();
    }
}