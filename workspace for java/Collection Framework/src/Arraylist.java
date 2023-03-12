import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       System.out.println(list);

       //add at particular index
       list.add(0,5);
        System.out.println(list);

       //set at index
        list.set(0,9);
        System.out.println(list);

        //sort list
        Collections.sort(list);
        System.out.println(list);

        //delete element
        list.remove(0);
        System.out.println(list);



        //iterate
       for(int i=0; i<list.size(); i++){
           System.out.print(list.get(i) + " ");
       }
    }
}
