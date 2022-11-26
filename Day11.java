import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int number = sc.nextInt(); // Taking Input From User
        for (int i = 1; i <= number; i++) // For Loop
        {
            a = b; // Value Of b Will Be Asisgned To a
            b = c; // Value Of c Will Be Asisgned To b
            c = a + b; // Value Of a+b Will Be Assigned To c
            System.out.print(a + " "); // Printing In Same Line With Spaces
        }
        sc.close();
    }
}
