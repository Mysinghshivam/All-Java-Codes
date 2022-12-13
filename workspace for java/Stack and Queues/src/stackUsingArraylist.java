import java.util.ArrayList;

public class stackUsingArraylist {
    public static ArrayList<Integer> list = new ArrayList<>();
    public  static class Stack{


        public void push( int data){
            list.add(data);
        }

        public int pop(){
            if (list.isEmpty()){
                System.out.print("there is no element in the list");
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }


        public int peek(){
            if (list.isEmpty()){
                System.out.print("there is no element in the list");
                return -1;
            }
            return list.get(list.size()-1);
        }


        public void print(){
            while (!list.isEmpty()){
                System.out.print(peek()+" ");
                pop();
            }
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.print(stack.pop());
        //stack.print();
    }
}
