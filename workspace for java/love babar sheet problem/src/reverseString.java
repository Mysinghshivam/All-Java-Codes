public class reverseString {
    public static void reverse(String str){
        String rev ="";
        for (int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.print(rev);
    }
    public static void main(String [] args){
        String str = "abcde";
        reverse(str);
    }


}
