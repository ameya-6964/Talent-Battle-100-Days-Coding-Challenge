import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        int a, b, c, d, x, y, i, gcd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator for 1st number :");
        a = sc.nextInt();
        System.out.println("Enter the denominator for 1st number :");
        b = sc.nextInt();
        System.out.println("Enter the numerator for 2nd number :");
        c = sc.nextInt();
        System.out.println("Enter the denominator for 2nd number :");
        d = sc.nextInt();
        sc.close();
        x = (a * d) + (b * c); // numerator
        y = b * d; // denominator
        // Reduce it to the simplest form by using gcd.
        for (i = 1; i <= x && i <= y; ++i) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The added fraction is " + x / gcd + "/" + y / gcd);
    }
}