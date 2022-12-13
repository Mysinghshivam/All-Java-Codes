public class NegativeOneSide {
    public static void main(String[] args) {
        int [] a={-1,2,-3,6,-2,9};
        int mid = 0;
        for (int i =0; i<  a.length; i++){
            if (a[i] < 0){
                int temp = a[i];
                a[i] = a[mid];
                a[mid] = temp;
                i++;
                mid++;
            }else{
                mid++;
            }
        }
        for (int value : a){
            System.out.print(value + " ");
        }
    }
}
