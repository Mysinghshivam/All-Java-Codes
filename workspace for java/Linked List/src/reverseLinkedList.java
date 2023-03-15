public class reverseLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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

//    //reverse using iteration
//    public void reverseIterate(){
//        if (head == null || head.next == null){
//            return;
//        }
//
//        Node previousNode = head;
//        Node currNode = head.next;
//
//        while (currNode != null){
//            Node nextNode = currNode.next;
//
//            currNode.next = previousNode;
//
//            //update
//            previousNode = currNode;
//            currNode = nextNode;
//        }
//        head.next = null;
//        head = previousNode;
//    }

    //reverse using recursion
    public void reverseRecursion(Node previousNode, Node currNode){
        if (currNode == null){
            head.next = null;
            head = previousNode;
            return;
        }
        if (head == null || head.next == null){
            return;
        }
        Node nextNode = currNode.next;
        currNode.next = previousNode;

        reverseRecursion(currNode,nextNode);

    }
    public static void main(String[] args) {
        reverseLinkedList ll = new reverseLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.printList();

//        ll.reverseIterate();
//        ll.printList();

        ll.reverseRecursion(ll.head, ll.head.next);  //if we have only one node then this condition will be fail
        ll.printList();

    }
}
