import java.util.Stack;

//push at the bottom of the stack
public class stackProblem {
    public static void addBottom(int data, Stack<Integer> s){

        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        addBottom(data,s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);


        addBottom(4, stack);

        while (!stack.isEmpty()){
            System.out.println(stack.peek()+ " ");
            stack.pop();
        }
    }
}
