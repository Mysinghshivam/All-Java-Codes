import javax.swing.*;
import java.util.HashSet;
import java.util.Iterator;

public class hashproblems {

    public static void union(int [] arr1, int [] arr2){
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }

        for (int i=0; i<arr2.length; i++){
            hs.add(arr2[i]);
        }

//        System.out.println(hs + " ");
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("\n"+hs.size());

    }
    public static void main(String[] args) {
        int [] arr1 ={2,5,9,5,1};
        int [] arr2 = {7,8,9,5,7,2};
        union(arr1, arr2);

    }
}
