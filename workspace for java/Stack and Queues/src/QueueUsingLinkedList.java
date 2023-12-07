public class QueueUsingLinkedList {

    public static Node Front , Rear = null;


    public static class Node{
        int data;
        Node next;
          Node(int data){
              this.data = data;
              this.next = null;
          }
    }

    public static boolean isEmpty(){
        return Front  == null;
    }
    public static class QUsingLinkedList{
        //adding od data
        public void add(int data){
            Node newNode = new Node(data);
            if ( Rear == null){
                Front = Rear = newNode;
                return;
            }
            Rear.next = newNode;
            Rear = newNode;
        }

        //deleting of data
        public int delete(){
            if(isEmpty()){
                System.out.print("Queue is empty");
               return -1;
            }
            int result = Front.data;
            if (Front == Rear){
                Rear = null;
            }
            Front = Front.next;
            return result;
        }

        //peak
        public int peak(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return Front.data;
        }

    }
    public static void main(String args []){
        QUsingLinkedList qUsingLinkedList = new QUsingLinkedList();
        qUsingLinkedList.add(1);
        qUsingLinkedList.add(2);
        qUsingLinkedList.add(3);
        qUsingLinkedList.add(4);
        qUsingLinkedList.add(5);

        while (!isEmpty()){
            System.out.println(qUsingLinkedList.peak());
            qUsingLinkedList.delete();
        }
    }
}
