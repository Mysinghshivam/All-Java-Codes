import java.util.*;
public class input {
    public static void main(String[] args) {
      //input
      System.out.print("Enter first number:");
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      System.out.print("Enter second number: ");
      int b=sc.nextInt();
      int sum=a+b;
      System.out.print("sum: "+ sum);
    }
}