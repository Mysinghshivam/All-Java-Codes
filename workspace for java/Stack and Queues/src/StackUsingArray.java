
import java.util.Scanner;

public class StackUsingArray {
    //size of stack is 10.
    private int sizeOfStack = 10;
    private int stack [] = new int[sizeOfStack];
    private int top = -1;


    //print stack data
    public void printStack(){
        for (int i=0; i<=top; i++){
            System.out.print(stack[i] + " ");
        }

    }

    //push element in stack
    public void push(int data){

        if (top == sizeOfStack-1){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top] = data;
    }


    //pop element
    public int pop(){
        if (top == -1){
            System.out.println("stack underflow");
            return -1;
        }
        int popedItem = stack[top];
        top--;
        return popedItem;
    }


    public static void main(String [] args){
        StackUsingArray stackUsingArray = new StackUsingArray();

        //push data
        stackUsingArray.push(1);
        stackUsingArray.push(2);
        stackUsingArray.push(3);

        stackUsingArray.printStack();

        //pop data
        System.out.print(stackUsingArray.pop());

        stackUsingArray.printStack();

    }
}
