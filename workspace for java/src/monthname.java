import java.util.*;
public class monthname {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter month number(1 to 12)");
        int b =a.nextInt();
        switch (b) {
            case 1: System.out.print("JANUARY");
                    break;
            case 2: System.out.print("FEBRUARY");
                    break;
            case 3: System.out.print("MARCH");
                    break;
            case 4: System.out.print("APRIL");
                break;
            case 5: System.out.print("MAY");
                break;
            case 6: System.out.print("JUNE");
                break;
            case 7: System.out.print("JULY");
                break;
            case 8: System.out.print("AUGUST");
                break;
            case 9: System.out.print("SEPTEMBER");
                break;
            case 10: System.out.print("OCTOBER");
                break;
            case 11: System.out.print("NOVEMBER");
                break;
            case 12: System.out.print("DECEMBER");
                break;
        }
    }
}