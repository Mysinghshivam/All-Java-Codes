import java.util.Scanner;

class insertion {
    public void operation(int n, int array[]) {
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = array[i];
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        for (int val : array) {
            System.out.print(val + " ");
        }
    }
}

public class insertionSort {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number array elements:");
        int n = a.nextInt();
        int[] array = new int[n];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = a.nextInt();
        }
        insertion x = new insertion();
        x.operation(n, array);
    }
}
