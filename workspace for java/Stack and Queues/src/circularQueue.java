public class circularQueue {

    static class CQueue {
        static int size;
        static int arr[];
        static int front = -1;
        static int rear = -1;

        CQueue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        //add data in circular queue
        public void push(int data) {
            if (isFull()) {
                System.out.print("Queue full");
                return;
            }
            //for 1st element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //enqueue data O(1)
        public int pop() {
            if (isEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            int result = arr[front];
            //when only one element in the queue
            if (front == rear) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        //peek value
        public int peek() {
            if (isEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CQueue queue = new CQueue(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.print(queue.pop());
        queue.push(6);
        System.out.print(queue.pop());
        queue.push(7);
        while (!queue.isEmpty()){
            System.out.print(queue.peek());
            queue.pop();
        }
    }
}
