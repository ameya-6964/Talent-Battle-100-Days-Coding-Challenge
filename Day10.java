import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        int factorial = 1; // Declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        sc.close();
    }
}
