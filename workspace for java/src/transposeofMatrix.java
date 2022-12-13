import java.util.Scanner;

public class transposeofMatrix {
   public static void main(String [] args){
       Scanner a=new Scanner(System.in);
       System.out.print("Enter the number of row:");
       int n1=a.nextInt();
       System.out.print("Enter the number of column:");
       int n2=a.nextInt();
       int [][] array=new int[n1][n2];
       int [][] array1=new int[n1][n2];
       System.out.println("Enter the matrix:");
       for (int i=0;i<n1;i++){
           for (int j=0;j<n2;j++){
               array[i][j]=a.nextInt();
           }
       }
       //now transpose logic
       for (int i=0;i<n1;i++){
           for (int j=0;j<n2;j++){
               array1[j][i]=array[i][j];
           }
       }
       // your original matrix
       for (int i=0;i<n1;i++){
           for (int j=0;j<n2;j++){
               System.out.print(" "+array[i][j]);
           }
           System.out.println();
       }
       System.out.println();
       //printing transpose matrix
       for (int i=0;i<n1;i++){
           for (int j=0;j<n2;j++){
               System.out.print(" "+array1[i][j]);
           }
           System.out.println();
       }
   }
}
