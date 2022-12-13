
import java.util.Scanner;
/*public class TenQuestion {
     static int sum(int n){
         int add=0;
        for (int i=1;i<=n;i++){
            if (i % 2!=0){
                add=add+i;
            }
        }
       return add;
    }
    public static void main(String [] args){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the nth value:");
        int n=a.nextInt();
       int add= sum(n);
        System.out.print(add);
    }
}*/
//print x to the power n
/*
class TenQuestion{
    public  static void main(String [] args){
        Scanner a=new Scanner(System.in);
        int x=a.nextInt();
        int n=a.nextInt();
        System.out.print(Math.pow(x,n));
    }
}*/
//fibonacci
/*
class TenQuestion{
    public static void main(String [] args){
        Scanner c=new Scanner(System.in);
        System.out.print("Enter the n th term:");
        int n=c.nextInt();
        int a=0,b=1;
        System.out.print(a+" ");
        if (n>1){
            for (int i=2;i<=n;i++){
                System.out.print(b+" ");
                int temp=b;
                b=a+b;
                a=temp;
            }
        }
    }
}*/
/*
//GCd
class TenQuestion{
    public static void main(String [] args) {
        Scanner a=new Scanner(System.in);

        int x=a.nextInt();
        int y=a.nextInt();
        int g=0;
        for (int i=1;i<=x;i++){
            if (x % i == 0 && y % i == 0){
                g=i;
            }
        }
        System.out.print("GCD : "+g);
    }
}*/
