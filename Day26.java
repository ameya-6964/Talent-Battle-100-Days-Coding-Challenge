import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of People");
        int number = sc.nextInt();
        int totalHandshakes = number * (number - 1) / 2;
        System.out.println(totalHandshakes);
        sc.close();
    }
}