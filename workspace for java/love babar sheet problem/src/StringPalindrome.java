public class StringPalindrome {
    public static boolean palindrome(String str){
        String rev = "";
        for (int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)){
            return true;
        }else
            return false;
    }
    public static void main(String [] args){
        String str = "abba";
        boolean ans= palindrome(str);
        System.out.print(ans);
    }
}
