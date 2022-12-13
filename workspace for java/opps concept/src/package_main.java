import mypack.addition;
import mypack.subtraction;
import mypack.subpack.mulitiply;

public class package_main {
    public static void main(String[] args) {
        addition s1 = new addition();
        int c = s1.sum(10, 20);
        System.out.println("Addition is: " + c);
        subtraction s2 = new subtraction();
        int c1 = s2.subtract(20, 10);
        System.out.println("subtraction is: " + c1);
        mulitiply s3 = new mulitiply();
        int c2 = s3.multiply(10, 20);
        System.out.println("multiply is: " + c2);
    }
}
