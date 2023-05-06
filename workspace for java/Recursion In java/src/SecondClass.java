//Tower of hanoi....
/*import java.util.Scanner;

public class SecondClass {
    public static void TowerOfHanoi(int n, String src, String hel, String des ){
        if (n == 1){
            System.out.println("Transfer disk " +n+ " from " +src+ " to " +des);
            return;
        }
        TowerOfHanoi(n-1, src, des, hel);
        System.out.println("Transfer disk " +n+ " from " +src+ " to " +des);
        TowerOfHanoi(n-1, hel, src, des);
    }
  public static void main(String [] args ){
      Scanner in =new Scanner(System.in);
      System.out.print("Enter the number of disks: ");
      int n=in.nextInt();
      TowerOfHanoi(n, "S","H","D");
  }

}*/


//Time complexity O(2^n - 1) or O(2^n)

import java.util.Scanner;

//Reverse of string....
/*
import java.util.Scanner;

class SecondClass{
     public static void Reverse(String str,int n){
         if(n == 0){
             System.out.print(str.charAt(n));
             return;
         }
         System.out.print(str.charAt(n));
         Reverse(str,n-1);
     }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String  str = sc.nextLine();
        Reverse(str,str.length()-1);
    }
}

time complexity O(n) means length of string

*/


//Occurrence of an element....

 /*class SecondClass{
     public static int first = -1;
     public static int last = -1;
     public static void occurence(String str, int idx, char element) {
        if (idx == str.length()){
            System.out.println("First Occurrence is :"+first);
            System.out.print("Last Occurrence is:"+last);
            return;
        }
        char current = str.charAt(idx);
        if (current == element){
            if (first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        occurence(str,idx+1,element);
    }
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the String:"); //String is abaacdaefaah
        String str = sc.nextLine();
        occurence(str,0,'a');
    }
 }

 time complexity O(n)
*/


//checking of strictly increasing order....
/*
class SecondClass {
    static boolean check_reverse(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
//         if (arr[idx] >= arr[idx + 1]) {
//            return false;
//        }
//        return check_reverse(arr, idx + 1);
        if (arr[idx] < arr[idx + 1]) {
            return check_reverse(arr, idx + 1);
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array:");
        int n = sc.nextInt();
        System.out.print("Enter the array:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(check_reverse(arr, 0));
    }
}
 //time complexity O(n)
*/


//move all x at the end of String....
/*class SecondClass {
    static void moveChar(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int j = 0; j < count; j++) {
                newString += 'x';
            }
            System.out.print(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count += 1;
            moveChar(str, idx + 1, count, newString);
        } else {
            newString += currChar;
            moveChar(str, idx + 1, count, newString);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        moveChar(str, 0, 0, "");
    }
}
//time complexity O(n + count)=O(n+n) = O(2n) = O(n)*/

//remove the duplicates....

/*class SecondClass{
    public static boolean [] map = new boolean[26];
    public static void remove_Duplicates(String str, int idx, String newString){
        if (idx == str.length()){
            System.out.print(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true){
            remove_Duplicates(str, idx+1, newString);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            remove_Duplicates(str, idx+1, newString);
        }
    }
    public static void main (String args []){
        String str = "abbccda";
        remove_Duplicates(str, 0, "");
    }
}

*/

//print all subsequences...
/*class SecondClass{
    public static void allSubsequence(String str, int idx, String newString){
        if (idx == str.length()){
            System.out.print(newString);
            return;
        }
        char currChar= str.charAt(idx);
        //if character wants to add then
        allSubsequence(str, idx+1, newString + currChar);
        //if character do want to add
        allSubsequence(str,idx+1, newString);
    }
    public static void main (String args []){
        String str = "abc";
        allSubsequence(str, 0, " ");
    }
}
//time complexity  O(2^n) */

//print all unique subsequences
/*
//we will use hashset
import java.util.HashSet;

class SecondClass {
    public static void allSubsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.print(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //if character wants to add then
        allSubsequence(str, idx + 1, newString + currChar, set);
        //if character do want to add
        allSubsequence(str, idx + 1, newString, set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        allSubsequence(str, 0, " ", set);
    }
}
//time complexity O(2^n)
*/


/*
//print mobile keypad combination
class SecondClass {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char curChar = str.charAt(idx);
        String mapping = keypad[curChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String args[]) {
        String str = "23";
        printComb(str, 0, "");
    }
}*/
