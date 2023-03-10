/*
public class Merge_sort {
    public static void concur(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        //if (idx2 > ei) {
            while (idx1 <= mid) {
                merged[x++] = arr[idx1++];
            }
        //}
        //if (idx1 > mid) {
            while (idx2 <= ei) {
                merged[x++] = arr[idx2++];
            }
        //}
            for (int i = 0, j = si; i < x; i++, j++) {
                arr[j] = merged[i];
            }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;  //(si+ei)/2;
        //divide first half
        divide(arr, si, mid);
        //divide second half
        divide(arr, mid + 1, ei);
        //to merge the divided array in sorted way
        concur(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 5, 2, 9,};
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/
class Merge_sort {
    public static void concur(int arr[], int si, int mid, int ei){
        int [] merged = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei){
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        //convert in to our main array
        for (int i=0 , j = si ; i<x ; i++, j++){
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei){
        if (si >= ei){
            return;
        }
        int mid =  si+ (ei-si)/2;  //(si+ei)/2
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        concur(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int [] arr = {2,4,8,1,9,5,2};
        int n = arr.length;
        divide(arr, 0, n-1);

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
