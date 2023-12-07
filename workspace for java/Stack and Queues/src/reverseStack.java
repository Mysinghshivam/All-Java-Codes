import java.util.Stack;

public class  reverseStack {

    public static void addBottom(int data, Stack<Integer> s){

        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        addBottom(data,s);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        addBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverseStack(stack);

        while (!stack.isEmpty()){
            System.out.println(stack.peek()+ " ");
            stack.pop();
        }
    }
}
