import java.util.ArrayList;
import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String args []){
        Scanner in =new Scanner(System.in);
        // Decimal to Binary
        System.out.print("Enter Decimal number:");
        int deci=in.nextInt();
//        int bin []=new int[10];
        //use arraylist because of dynamic memory allocation
        ArrayList<Integer> bin = new ArrayList<>();
        int temp =0;
       while (deci >0){
           bin.add(deci % 2);
           deci=deci/2;
       }
       for (int i= bin.size()-1 ; i>=0; i--){
           System.out.print(bin.get(i));
       }



        /*//Binary to Decimal
        System.out.print("Enter Binary number:");
        int bin=in.nextInt();
        int n=0;
        double deci=0;

        //another method
        *//*while (true){
            if(bin == 0) {
                break;
            }else{
                int temp=bin % 10;
                deci = deci + temp*Math.pow(2,n);
                bin =bin/10;
                n++;
            }
        }
        System.out.print((int) deci);*//*


        while (bin > 0){
            int temp = bin % 10;
            deci = deci + temp*Math.pow(2,n);
            bin = bin/10;
            n++;
        }
        System.out.print((int) deci);*/
    }
}
