import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter algebraic expression: ");
        String str = sc.nextLine();
        String newstr = str.replaceAll("[(){}]", "");
        System.out.println(newstr);
        sc.close();
    }
}
