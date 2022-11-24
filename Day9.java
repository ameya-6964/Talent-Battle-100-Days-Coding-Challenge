import java.util.Scanner;

public class Day9 {
    static int digitCounter(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number");
        int n = sc.nextInt();
        System.out.println(digitCounter(n));
        sc.close();
    }
}
