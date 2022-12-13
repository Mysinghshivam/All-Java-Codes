//import java.util.Arrays;
//
//public class forpractice{
//    public static void concur(int [] a, int si, int mid, int ei){
//        int [] merged = new int[ei - si + 1];
//        int idx1 = si;
//        int idx2 = mid+1;
//        int i = 0;
//        while (idx1 <= mid && idx2 <= ei){
//            if (a[idx1] <= a[idx2]){
//                merged[i++] = a[idx1++];
//            }else{
//                merged[i++] = a[idx2++];
//            }
//        }
//
//        //if array 1 is greater than array 2
//        while (idx1 <= mid){
//            merged[i++] = a[idx1++];
//        }
//
//        //if array 2 is greater than array 2
//        while (idx2 <= ei){
//            merged[i++] = a[idx2++];
//        }
//
//        for (int index = 0, k = si; index< i ; index++,k++){
//            a[k] = merged[index];
//        }
//    }
//    public static void divide(int [] a, int si, int ei){
//        if (si >= ei){
//            return;
//        }
//
//        int mid = si + (ei - si) / 2;
//        //first we divide the unsorted array
//        divide(a, si, mid);
//        divide(a, mid+1, ei);
//
//        //after we will concur
//        concur(a, si, mid, ei);
//    }
//    public static void main(String[] args) {
//        int [] a = {5,2,3,7,1,4};
//        int n = a.length;
//        divide(a, 0, n-1);
//
//        for (int i =0; i< n; i++){
//            System.out.print(a[i] + " ");
//        }
//    }
//}
