import java.util.HashSet;

public class tcs {
    public static int a = 0;

    public static int answer(String str) {
        int a = 1;
        HashSet<Integer> Hs = new HashSet<>();
        for (int i=0; i<str.length(); i++){
            Hs.add(str.charAt(i) - '0');
        }
        for (int i=0; i<str.length(); i++){
            if (Hs.contains(a)){
                a++;
            }else{
                break;
            }
        }
        return a;
    }

    public static void subssequences(int[] arr, int idx, String newInteger) {

        if (idx == arr.length) {
            int p = answer( newInteger);
            //System.out.println(newInteger);
            a = a + p;
//            System.out.println(a);
            return;
        }

        int currInt = arr[idx];

        //wants to add
        subssequences(arr, idx + 1, newInteger + currInt);

        //don't want to add
        subssequences(arr, idx + 1, newInteger);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n = arr.length;
        subssequences(arr, 0, "");
        System.out.println(a);
    }
}
/*
public class tcs {
    public static void reverse(int[] arr, int n, int k) {
        int right;
        for (int i = 0; i < n; i += k) {
            int left = i;
            if (k - 1 + i < n - 1) {
                right = k - 1 + i;
            } else {
                right = n - 1;
            }
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        reverse(arr, n, 3);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
*/
