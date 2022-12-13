public class ReverseofString {
    public static void main(String args []){
        String str ="abcd" , nstr="";
        char ch;
        for (int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            nstr =ch + nstr;
        }
        System.out.print(nstr);
    }
}
