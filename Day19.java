import java.util.Scanner;

public class Day19 {
    static int digitCounter(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int lastDigit = 0;
        int temporary = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int number = sc.nextInt();
        temporary = number;

        while (temporary != 0) {
            lastDigit = temporary % 10;
            sum = (int) (sum + Math.pow(lastDigit, digitCounter(number)));
            temporary = temporary / 10;
        }
        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong number");
        }
        sc.close();
    }

}
