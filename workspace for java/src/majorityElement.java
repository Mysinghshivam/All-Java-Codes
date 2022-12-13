public class majorityElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,4,2,2,2,6,2} ;

        for (int i = 0; i<arr.length; i++){
            int count = 1;
            for (int j =i+1; j<arr.length; j++){
                if (arr [i] == arr[j]){
                    count++;
                    if (count > arr.length/2){
                        System.out.println("Majority element is:"+arr[i]);
                        break;
                    }
                }
            }
        }
    }
}
