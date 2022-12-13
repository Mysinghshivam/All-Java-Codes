import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class dictionaryorder {
    public static void main(String [] args){
        Scanner a=new Scanner(System.in);
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of words:");
        int n=a.nextInt();
        System.out.printf("Enter %d strings:",n);
        String [] str=new String[n];
        try {
              for (int i = 0; i < n; i++) {
                str[i] = a.next();
              }
        }catch(Exception e){}
            /*for (int j=0 ;j<n-1 ;j++){
               for (int k=0 ;k<n-j;k++){
                  String str1=str[k];
                  String str2=str[k+1];
                  int p=str1.compareTo(str2);
                   if (p>0){
                     String temp=str[k];
                     str[k]=str[k+1];
                     str[k+1]=temp;
                  }
               }
            }*/
        Arrays.sort(str);
         //Collections.reverseOrder();

         for (String value:str) {
             System.out.println(value);
         }
    }
}
