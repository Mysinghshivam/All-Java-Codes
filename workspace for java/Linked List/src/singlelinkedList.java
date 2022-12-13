import java.util.Scanner;

public class singlelinkedList {
    Node head;
    private int size;

     singlelinkedList(){
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


    //add at first end
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    //add at last
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


    //add at specific position
    public void addSpecificPosition(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("There is no node so we add at first position:");
            head = newNode;
            return;
        }
        Node currNode = head;
        int count = 0;
        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        System.out.print("Enter the position where you want to enter the node 1 to " + count + ":");
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        currNode = head;
        int i = 2;
        while (i != position) {
            currNode = currNode.next;
            i++;
        }
        newNode.next = currNode.next;
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


    //delete first node
    public void deleteFirst(){
        if (head == null){
            System.out.println("there is no node");
            return;
        }
        size--;
        head = head.next;
    }


    //delete last node
    public void deleteLast(){
        if (head == null){
            System.out.println("There is no node in the list:");
            return;
        }
        size--;

        if (head.next == null){
            head = null;
            return;
        }

        Node lastNode = head.next;
        Node secondLastNode = head;
        while (lastNode.next != null){
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }
        secondLastNode.next = null;
    }


    //return size of list
    public int sizeList(){
         return size;
    }
    public static void main(String[] args) {
        singlelinkedList ll = new singlelinkedList();
       ll.addFirst(2);
       ll.addFirst(1);
       ll.printList();

       ll.addLast(3);
       ll.addLast(4);
       ll.printList();

       //ll.addSpecificPosition(5);
       //ll.printList();

        ll.deleteFirst();
        ll.printList();

        ll.deleteLast();
        ll.printList();

        System.out.println("Size of List " + ll.sizeList());
    }
}
