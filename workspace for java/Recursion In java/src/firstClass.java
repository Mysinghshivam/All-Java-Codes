

public class firstClass {

   /*  public static void printNum(int n){
     if (n==0)
         return;
        System.out.print(" "+n);
        printNum(n-1);
    }
    public static void main(String [] args){
        int n=5;
        printNum(n);
    }*/


   /* //sum of 1 to n numbers using recursion
    public static void sum(int i,int n,int sum){
        if (i==n){
           sum +=i;
           System.out.println(sum);
           return;
        }
        sum +=i;
        sum(i+1,n,sum);
        System.out.println(i);
    }
    public static void main(String [] args){
        sum(1,5,0);
    }*/



    /*  //recursion (factorial program)
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
         return n* factorial(n-1);
        }
    }
    public static void main(String args []){
        int num=4;
        int value=factorial(num);
        System.out.println(value);
    }*/


    /*  //fibonacci series
    public static void fibonacci(int a,int b,int n){
        if (n==0){
            return;
        }
        int c=a+b;
        System.out.print(","+c);
        fibonacci(b,c,n-1);
    }
    public static void main(String args []){
        int a=0,b=1;
          //number of terms
        int n=10;
        System.out.print("Fibonacci series: "+a+","+b);
        fibonacci(a,b,n-2);
    }*/


    /*//print x^n (Stack height n)
    //we can write x^n=x * x^n-1 so
    public static int calPow( int x, int n){
        if(x == 0)
            return 0;
        if (n == 0)
            return 1;
        //int xpuwnm1=calpow(x,n-1);
        //int xpow=x*xpuwnm1;
        //return xpow;
         return x * calPow(x,n-1);
    }
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x=in.nextInt();
        System.out.print("Enter the value of y:");
        int n=in.nextInt();
        int finValue=calpow(x,n);
        System.out.print(finValue);
    }*/


    //print x^n (Stack height =log n)
    //for even we can write x^n= x^n/2 *x^n/2
    //for odd we can write x^n= x^n/2 *x^n/2 *x
    public static int powcal(int x,int n){
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        if (n % 2 == 0){
            return powcal(x,n/2) * powcal(x,x/2);
        } else {
            return x * powcal(x,n/2) * powcal(x,n/2);
        }
    }
    public static void main (String [] args){
        int x=2,n=5;
        int value = powcal(x,n);
        System.out.print(value);
    }
}
