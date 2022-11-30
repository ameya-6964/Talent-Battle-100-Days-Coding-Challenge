import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        int reversed = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Numbers");
        int number = sc.nextInt();
        for (int digit = 0; number != 0; number = number / 10) {
            digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println(reversed);
        sc.close();
    }
}
