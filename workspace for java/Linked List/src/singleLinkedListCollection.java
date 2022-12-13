import java.util.*;

public class singleLinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> List = new LinkedList<Integer>();

        List.addFirst(2);
        List.addFirst(1);
        System.out.println(List);

        List.addLast(3);
        List.addLast(4);
        List.add(5);
        System.out.println(List);

        System.out.println(List.size());

        for (int i =0; i<List.size(); i++){
            //for search any element if(List.get(i) == searchedValue)
            System.out.print(List.get(i) + "->");
        }
        System.out.print("null");


        //remove first
        List.removeFirst();
        System.out.println("\n" + List);

        //remove last
        List.removeLast();
        System.out.println(List);

        List.remove(2);
        System.out.println(List);

    }
}
