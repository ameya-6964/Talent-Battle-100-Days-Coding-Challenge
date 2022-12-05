import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Numbers");
        int number = sc.nextInt();
        sc.close();
        while (number != 0) {
            sum = sum + number % 10;
        }
        System.out.println(sum);
    }
}
