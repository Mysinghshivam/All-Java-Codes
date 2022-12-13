import java.util.HashMap;
import java.util.Map;

public class hashMapProblem {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        //insertion
        hm.put(1, "shivam");
        hm.put(2, "ram");
        hm.put(3, "ramu");
        hm.put(4, "hari");
        System.out.println(hm + "");

        //searching
        if (hm.containsKey(2)) {
            System.out.println(hm.get(2));
        }
        // for(Map.Entry<Integer, String> e : hm.entrySet());{
        System.out.println(hm.entrySet());//by this output will be in square brackets

    }
}
