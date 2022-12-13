import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class StringProblem {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String Original= in.next();
        String result= "";
        for (int i=0; i<Original.length(); i++){
            if (Original.charAt(i) == 'e'){
                result +='i';
            } else{
                result += Original.charAt(i);
            }
        }
        System.out.print(result);
    }
}
