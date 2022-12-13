import java.util.HashSet;

//this is only for sorted array
/*
public class union {
    public static void  union(int [] a, int n, int [] b, int m){
        int i = 0,j =0;
        while (i < n && j < m){
            if(a[i] < b[j]){
                System.out.println(a[i++]);
            }else if (b[j] < a[i]){
                System.out.println(b[j++]);
            }else{
                System.out.println(a[i++]);
                j++;
            }
        }
        while (i < n){
            System.out.println(a[i++]);
        }
        while (j < m){
            System.out.println(b[j++]);
        }
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = {1,2,3};
        union(a, 5, b, 3);
    }
}
*/
//for not sorted array
public class union {
    public static void union(int [] a, int n, int [] b, int m){
        HashSet<Integer> set = new HashSet<>();
        for (int i =0; i<n; i++){
            if (set.contains(a[i])){
                System.out.println(a[i]);
            }else{
                set.add(a[i]);
            }
        }
        for (int j =0; j<m; j++){
            if (set.contains(b[j])){
                System.out.println(b[j]);
            }else{
                set.add(b[j]);
            }
        }
        System.out.println("union:" + set);
    }
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 4, 5};
        int[] b = {1, 2, 3};
        union(a, 5, b, 3);
    }
}