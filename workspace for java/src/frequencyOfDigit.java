import java.util.Scanner;

public class frequencyOfDigit {
    public static void main(String [] args){
        Scanner a= new Scanner(System.in);
        System.out.print("Enter string:");
        String str=a.nextLine();
        int [] array=new int[10];
        int i;
        for(i=0;i<str.length();i++) {
            if (str.charAt(i)>=48 && str.charAt(i)<=57){
                array[str.charAt(i)-48]++;
            }
        }
        for (int value:array){
            System.out.print(value);
        }
    }
}
