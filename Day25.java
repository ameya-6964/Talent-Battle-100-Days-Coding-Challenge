import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        final double PIE = 3.14; // Declaration Of Pie
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Of Radius ");
        double radius = sc.nextDouble(); // Geting Value Of Radius From User
        double area = radius * radius * PIE; // Area Of Circle Formula
        System.out.println(area);
        sc.close();
    }
}
