import java.util.Scanner;

public class selectionSort {
    public static void selection(int n,int array[]){
        for (int i=0; i<n; i++) {
            int small = array[i];
            int loc=i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < small) {
                    small = array[j];
                    loc=j;
                }
            }
            int temp=array[i];
            array[i]=small;
            array[loc]=temp;
        }
        for (int value: array){
            System.out.print(" "+value);
        }
    }
    public static void main(String [] args){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the number of elements of array: ");
        int n=a.nextInt();
        int array []=new int[n];
        System.out.print("Enter Elements: ");
        for (int i=0; i<n; i++){
            array[i]=a.nextInt();
        }
        selection(n,array);
    }
}
