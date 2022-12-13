import java.util.Scanner;
//for concatination of string we have to use + sign
public class strings {
        public static void main(String [] args) {
              Scanner a = new Scanner(System.in);
            System.out.print("Enter first string:");
            String str1 = a.nextLine();
//            System.out.print("Enter second string:");
//            String str2=a.nextLine();
//            String name1="shivam";
//            String name2="shiva";
//            if (name1.compareTo(name2)== 0){
//                System.out.println("true");
//            }
//            else{
//                System.out.println("flase");
//            }

            //str.length() by this we can find out the length of string
            //charAT[i] by this we can find out the specific position
            for (int i=0;i<str1.length();i++){
                System.out.println(str1.charAt(i));
            }
            /*//comapre the string
            //str1.compareTo(str2)
            //1.if str1>str2 return +ve value
            //2.if str1==str2 return 0
            //3.if str<str return -ve value
            if (str1.compareTo(str2)==0){
                System.out.print("String equal");
            }
            else{
                System.out.print("Not equal");
            }*/
         /*//substring(1,5) it return the value of 1st indexed to fourth index
            //[ we can use (str.getChar(xtr,2,3)]
            String name=str1.substring(2,str1.length());//if take input shivam then start with "i" and end with "m"
            System.out.print(name);*/
            //StringBuilder s=new StringBuilder("shivam") is used to do operations in java
            StringBuilder sb = new StringBuilder(str1); //we can direct give the string "Shivam"
            //replace sb.setCharAt(0,'A');
            sb.setCharAt(0,'A');
            //insert sb.insert
            System.out.println(sb);
            sb.insert(0,'s');
            System.out.println(sb);
            sb.insert(2,'h');
            System.out.println(sb);
            //delete
            sb.delete(0,2);
            System.out.println(sb);
           //append
            sb.append("p");
            System.out.println(sb);
            //reverse
           sb.reverse();
           System.out.println(sb);
           //replace
            sb.replace(0,6,"my name is shiva");
            System.out.println(sb);
            //reverse another method
            for (int i=0;i<sb.length()/2;i++) {

                int front=i;
                int end=sb.length()-1-i;

                char frontchar=sb.charAt(front);
                char endchar=sb.charAt(end);

                sb.setCharAt(front,endchar);
                sb.setCharAt(end,frontchar);
            }
            System.out.print(sb);
        }
}
