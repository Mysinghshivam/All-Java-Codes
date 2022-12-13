 import java.util.*;
public class pattern {
    public static void main(String args[]){
        //int n=4;  //rows
        //int m=5;  //column
        /*    * * * * * *
              * * * * * *
              * * * * * *
              * * * * * *
         for(int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }*/
        //printing pattern
       /* * * * *
        *       *
        *       *
        * * * * *
        for(int i=1;i<=n;i++){
                for (int j = 1; j <= m; j++) {
                    if(i==1 || i==n || j==1 || j==m){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            System.out.print("\n");
        }*/
       /* //half pyramid
        //*
        //* *
        //* * *
        //* * * *
        for(int i=1; i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }*/
      /* //     *
        //    * * *
        //  * * * * *
        //* * * * * * *
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int x = a.nextInt();
        for(int i=1;i<=x;i++){
            for (int k=i;k<x;k++){
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }*/
       /* //opposite pyramid
        //* * * *
        //* * *
        //* *
        //*
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }*/
       /* //pattern this type
        //      *
        //    * *
        //  * * *
        //* * * *
        for (int i=1;i<= 4; i++){
            for (int k =i ;k<4 ; k++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }*/
        /*//printing pattern with numbers
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.print("\n");
        }*/

        /*//floyd's triangle
        //1
        //2  3
        //4  5  6
        //7  8  9  10
        //11 12 13 14 15
        int num=1;
        for (int i=1 ; i<=5 ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print(" "+num);
                num++;
            }
            System.out.print("\n");
        }
        */
        /*//1
        //0 1
        //1 0 1
        //0 1 0 1
        //1 0 1 0 1
        int num=1;
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if (sum % 2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }*/
      /* //printing this type of pattern given below
        //   *             *
        //   * *         * *
        //   * * *     * * *
        //   * * * * * * * *
        //   * * * * * * * *
        //   * * *     * * *
        //   * *         * *
        //   *             *
        for (int i=1;i<=4;i++){       //printing first triangle
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
             int p=2 * (4-i);
            for (int l=p;l>=1;l--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=4;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print("* ");
            }
            int p=2 * (4-i);
            for (int l=p;l>=1;l--){
                System.out.print("  ");
            }
            for (int k=i;k>=1;k--){
                System.out.print("* ");
            }
            for (int l=4;l>i;l--){
                System.out.print("  ");
            }
            System.out.print("\n");
        }*/
       /* //printing this pattern(solid rhombus)
        //        * * * * *
        //      * * * * *
        //    * * * * *
        //  * * * * *
        //* * * * *
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for (int k=1; k<=i;k++){
                System.out.print("* ");
            }
            for(int l=i;l<n;l++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }*/
        /*//second method
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }*/
        /*//printing
        //    1
        //   2 2
        //  3 3 3
        // 4 4 4 4
        //5 5 5 5 5
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }*/
        /*//palindromic pyramid
        //        1
        //      2 1 2
        //    3 2 1 2 3
        //  4 3 2 1 2 3 4
        //5 4 3 2 1 2 3 4 5
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--){
             System.out.print(k+" ");
            }
            for(int l=2;l<=i;l++){
                System.out.print(l+" ");
            }
            System.out.print("\n");
        }*/
      /*  //printing diamond
        //      *
        //    * * *
        //  * * * * *
        //* * * * * * *
        //* * * * * * *
        //  * * * * *
        //    * * *
        //      *
        for(int i=1;i<=4;i++){
            for(int j=i;j<4;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=4;i>=1;i--){
            for(int j=4;j>i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }*/
        /*//printing hollow butterfly
        //*         *
        //**       **
        //* *     * *
        //*  *   *  *
        //*   **    *
        //*   **    *
        //*  *  *   *
        //* *     * *
        //**       **
        //*         *
        for(int i=1;i<=5;i++){
          for(int j=1;j<=i;j++){
              for(int k=i; k>=3;k++){

              }

          }
        }*/

    }
}

