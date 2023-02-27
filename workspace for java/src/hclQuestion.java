//swap two string without using temp variable
//String1 = cloud
//String2 = tech

public class hclQuestion {


    public static void reverse(String string1, String string2, int baseCase){
        if (baseCase == string1.length() - 1){
            string1 = string2;
            string2 = " ";
            System.out.print(string1);
            return;
        }
        char a = string1.charAt(baseCase);
        string2 = a + string2;
    }
    public static void main(String[] args) {

        reverse("cloud", "tech", 0);
    }
}
