import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        int sum = 0; // Declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int number = sc.nextInt(); // Taking Input From User
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}