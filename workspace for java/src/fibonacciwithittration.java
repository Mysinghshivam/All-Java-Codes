public class fibonacciwithittration {
    public static void main(String args[]){
        int a=0,b=1;
        System.out.print("Fibonacci series is: "+a+","+b);
        for (int i=3 ;i<=10 ;i++ ){
            int temp=a+b;
            System.out.print(","+temp);
            a=b;
            b=temp;
        }
    }
}
