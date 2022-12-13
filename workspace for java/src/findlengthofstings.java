import java.util.Scanner;

public class findlengthofstings {
    public static void main(String [] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the size of array of strigs:");
        int size=a.nextInt();
        String array[]=new String[size];
        int total_length=0;
        for (int i=0 ;i<size ;i++){
            array[i]=a.next();
            total_length += array[i].length();
        }
       System.out.print(total_length);

    }
}
