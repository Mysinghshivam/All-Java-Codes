import java.awt.*;
import java.util.Scanner;

public class bitmanipulation {
    public static void main(String [] args){
       /* //get bit 1.making butMask 2.and operation
        int n=5;// binary of 5 =0101
        int pos=4;
        int bitMask=1<<pos;
        if ((bitMask & n)==0){
            System.out.print("bit was zero:");
        } else{
            System.out.print("bit was one:");
        }*/



       /* //set bit 1.making butMask 2.OR operation
        int n=5;// binary of 5 =0101
        int pos=1;
        int bitMask=1<<pos;
        int new_number = bitMask | n;
        System.out.print(new_number);*/


       /* //clear bit
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int notbitMask=~(bitMask);
        int newNumber= notbitMask & n;
        System.out.print(newNumber);
*/


        /*//ipdate bit..update with 1 or 0
        //if we want to update through 1 the use set concept and if we want update with 0 the clear concept
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        Scanner a=new Scanner(System.in);
        System.out.print("Enter operation(update with zero or one:");
        int p=a.nextInt();
       if (p==0){
           //clear
           int notBitMask= ~(bitMask);
           int newNumber= notBitMask & n;
           System.out.print(newNumber);
       } else {
           //set
           int new_number= bitMask | n;
           System.out.print(new_number);
       }*/




        /*//bit question but I solve it in normal way
        int p=1;
        System.out.print("Enter the number either number is power of 2 or not:");
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        for (int i=0; i<n; i++){
            p = p*2;
            if (n==p) {
                System.out.println("power of 2:");
                break;
            }
        }
        if ( n!=p){
            System.out.println("is not a power of 2:");
        }*/
        //decimal to binary we have pre defined method also Integer.toBinaryString(10)
        System.out.print("Enter decimal number:");
        Scanner d=new Scanner(System.in);
        int decimal=d.nextInt();
        int binary[]=new int[20];
        int index=0;
        while (decimal >0){
            binary [index] = decimal % 2;
            decimal=decimal /2;
            index++;
        }
        for (int i=index-1;i>=0;i--){
            System.out.print(binary[i]);
        }
        //binary to decimal
        double deci=0,n=0;
        System.out.print("\nEnter binary number:");
        Scanner b=new Scanner(System.in);
        int bin=b.nextInt();
        while (true){
            if (bin == 0){
                break;
            }else{
                int temp=bin % 10;
                deci =deci + temp*Math.pow(2,n);
                bin =bin/10;
                n++;
            }
        }
        System.out.print("Decimal is:"+(int)deci);
    }
}


