import java.util.Scanner;

public class Day9 {
    static int digitCounter(long n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Random Numbers");
        long n = sc.nextLong();
        System.out.println("The Number Of Digits Are : " + digitCounter(n));
        sc.close();
        ;
    }
}
