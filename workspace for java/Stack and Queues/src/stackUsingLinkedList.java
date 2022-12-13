public class stackUsingLinkedList {

    //creation of node
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    //stack operation
    public static class Stack {
        public static Node head;  //head means top

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("no element in the stack");
                return -1;
            }
            int popedItem = head.data;
            head = head.next;
            return popedItem;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("no element in the stack");
                return -1;
            }
            return head.data;
        }

        public void print(){
            if (isEmpty()){
                System.out.println("no element in the stack");
            }
            while (!isEmpty()){
                System.out.println(peek());
                pop();
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.print();

//        System.out.println("Poped element is :"+stack.pop());
//
//        System.out.print("peek element is :" + stack.peek());
    }
}
