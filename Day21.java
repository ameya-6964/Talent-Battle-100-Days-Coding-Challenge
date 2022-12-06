import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = 0;
        int reversed = 0;
        System.out.println("Enter Number");
        int number = sc.nextInt();
        int temp = number;
        while (temp != 0) {
            digit = temp % 10; // To Get Last Digit
            reversed = reversed * 10 + digit; // To Reverese The Original Number
            temp = temp / 10; // Increment The Number
        }
        if (reversed == number) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
