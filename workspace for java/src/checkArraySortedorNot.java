import java.util.Scanner;

public class checkArraySortedorNot {
    public static void main(String [] args){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the number of element in the array:");
        int n=a.nextInt();
        int array []=new int[n];
        System.out.println("Enter array:");
        for (int i=0 ;i<n ;i++){
            array[i]=a.nextInt();
        }
        //logic to check array is ascending or not
        int small=array[0],p=0;
        for (int i=1 ;i<n ;i++){
            if (small <= array[i]){
                small=array[i];
                p++;
            }
        }
        if (p==n-1){
            System.out.print("your array is in sorted order");
        }
        else{
            System.out.print("your array is not in sorted order");
        }
    }
}
