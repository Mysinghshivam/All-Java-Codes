import java.util.Scanner;

public class studentmarks {
    public static void main(String args []){
      Scanner a=new Scanner(System.in);
        System.out.print("Enter input in (1 for start work 0 for end work:");
        int n=a.nextInt();
        while(n==1){
            System.out.println("Enter student marks:");
            int m=a.nextInt();
            if (m>=90 && m<=100){
                System.out.println("This is Good:");
            }
            else if(m>=60 && m<=89){
                System.out.println("This is also good:");
            }
            else if(m>=0 && m<=59){
                System.out.print("This is good as well:");
            }
            else{
                System.out.print("Invalid Input:");
            }
            System.out.print("Want to continue (enter 0(stop) or 1(start):");
             n=a.nextInt();
        }
    }
}
