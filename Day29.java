import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String");
        String str2 = sc.nextLine();
        System.out.println(str1 + str2);
        sc.close();
    }
}
