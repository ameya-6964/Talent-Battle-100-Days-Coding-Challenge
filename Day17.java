import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int number = sc.nextInt(); // Storing User Input
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) // Finding Factors
            {
                System.out.print(i + ","); // Printing Factors
            }
        }
        sc.close();
    }
}
