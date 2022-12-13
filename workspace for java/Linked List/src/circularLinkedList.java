public class circularLinkedList {
    public Node head ;
    public Node tail;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    //add data at first end
    public void addfirst(int data) {
        Node newNode = new Node(data);
//        if (head == null){
//            System.out.print("List is empty");
//        }
        newNode.next = head;
        head = newNode;
        tail.next = newNode;
    }

    //add data last in the linked list
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    //

    //display the elements
    public void printList(){
       Node currentNode = head;
       if (head == null){
           System.out.print("List is empty");
       }
        System.out.print("\nData of circularLinkedList: head->");
       do {
           System.out.print(currentNode.data+"->");
           currentNode = currentNode.next;
       }while (currentNode != head);
    }

    public static void main(String [] args){
      circularLinkedList cll = new circularLinkedList();
      cll.addLast(1);
      cll.addLast(2);
      cll.addLast(3);
      cll.printList();


      //add data at first sihde
      cll.addfirst(4);
      cll.printList();
    }
}
