import java.util.Scanner;

//print nth node from last and delete also

public class linkedListProblem2 {
    private int size;
    Node head;

    linkedListProblem2(){
         this.size = 0;
    }

    //making of nodes
    class Node{
        int data;
        Node next;
         Node(int data){
             this.data = data;
             this.next = null;
             size++;
         }
    }

    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    //print list
    public void print(){
        if (head == null){
            System.out.println("There is no node in the list");
            return;
        }
        Node  currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    //size of list
    public int sizeOfList(){
        return size;
    }

    //print nth node from last
    public void printNthNodeFromLast(){
       System.out.print("Enter the nth node from right side which you want to print:");
       Scanner in = new Scanner(System.in);
       int nthValue = in.nextInt();

        if (head == null){
            System.out.println("List is empty");
            return;
        }

       if (size == nthValue){
           System.out.println(nthValue + " node from right side is:"+head.data);
           return;
       }
       int currentIdx = size - nthValue;
       int i = 1;
       Node currentNode = head;
       while (i <= currentIdx){
           currentNode = currentNode.next;
           i++;
       }
       System.out.println(nthValue + " node from right side is:"+currentNode.data);
    }

    //delete nth Node From right side
    public void deleteNthNodeFromRightSide(){
        System.out.print("Enter nth Node from right which you want to delete:");
        Scanner in = new Scanner(System.in);
        int nthValue = in.nextInt();
        if (size == nthValue){
            System.out.println(nthValue +" node from right side is: " +head.data);
            head = head.next;
            return;
        }
        int prvNode = size - nthValue;
        int i = 1;
        Node CurrentNode = head;
        while (i < prvNode){
            CurrentNode = CurrentNode.next;
            i++;
        }
        System.out.println(nthValue + "node from right side is: "+CurrentNode.next.data);
        CurrentNode.next = CurrentNode.next.next;
    }
    public static void main(String[] args) {
      linkedListProblem2 linkedListProblem2 = new linkedListProblem2();
      linkedListProblem2.addLast(1);
      linkedListProblem2.addLast(2);
      linkedListProblem2.addLast(3);
      linkedListProblem2.addLast(4);
      linkedListProblem2.addLast(5);

      //call print list
      linkedListProblem2.print();

      //call size
      System.out.println(linkedListProblem2.sizeOfList());

//      //call print nth node from side
//        linkedListProblem2.printNthNodeFromLast();
//        linkedListProblem2.print();

        //call delete nth node from right side
        linkedListProblem2.deleteNthNodeFromRightSide();
        linkedListProblem2.print();

    }
}
