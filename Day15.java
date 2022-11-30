import java.util.Scanner;

public class Day15 {
    public static int factorial(int n) // Function For Finding factorial
    {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int sum = 0; // Declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt(); // Taking Input From User
        int n1 = n; // Copy Of n To Compare With Sum
        while (n != 0) {
            int d = n % 10; // To Get Last Digit
            sum = sum + factorial(d); // for Finding Sum of Factorial
            n = n / 10; // To Remove Last Digit After Every Iteration
        }

        if (sum == n1) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
        sc.close();
    }
}