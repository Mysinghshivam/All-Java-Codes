  // all permutations of a string
/*
public class thirdClass {
    public static void permutation(String str, String permutation){
        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i =0; i< str.length(); i++){
            char currchar = str.charAt(i);

            String newstr = str.substring(0,i) + str.substring(i+1);
            permutation(newstr, permutation + currchar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}
//time complexity O(n!)*/

//count total paths in a maze to move from (0,0) to (n,m)
//n =3, m= 3
/*
public class thirdClass{
    public static int countPaths(int i, int j, int n, int m){
        if (i == n || j == m){
            return 0;
        }
        if (i == n-1 && j == m-1){
            return 1;
        }
        //move downword
        int downCount = countPaths(i+1, j, n, m);
        //move right
        int rightCount = countPaths(i, j+1, n, m);


        return downCount + rightCount;
    }
    public static void main(String[] args) {
        int total_path = countPaths(0, 0, 3, 3);
        System.out.println(total_path);
    }
}*/


//place tiles size 1xm at the floor of size n x m
//n = 4, m= 2
public class   thirdClass{
    public static int tilesplacement(int n, int m){
        if (n == m){
            return  2;
        }
        if (n < m){
            return 1;
        }
        //when place tiles at horizontally
        int horizontalPlace = tilesplacement(n-1,m);

        //whe place tiles vertically
        int verticalPlace = tilesplacement(n-m,m);
        return horizontalPlace+verticalPlace;
    }
    public static void main(String[] args) {
        int n =4,m=2;
        int ans = tilesplacement(n,m);
        System.out.println(ans);
    }
}
