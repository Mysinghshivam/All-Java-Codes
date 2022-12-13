import java.util.Scanner;

public class MinMax {
    public static int minimum(int array[]){
        int min=array[0];
        for (int j=0;j<array.length;j++){
            if (min > array[j]){
                min=array[j];
            }
        }
        return min;
    }
    public static int maximum(int array []){
        int max=array[0];
        for (int j=0;j< array.length;j++){
            if (max<array[j]){
                max=array[j];
            }
        }
        return max;
    }
    public static void main(String [] args){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=a.nextInt();
        int [] array=new int[size];
        //input array
        System.out.print("Enter array:");
        for (int i=0;i<array.length;i++){
            array[i]=a.nextInt();
        }
        int min=minimum(array);
        System.out.println("Minimum number: " +min);
        int max=maximum(array);
        System.out.print("Maximum number: " +max);
     }
}
