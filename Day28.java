import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Random String ");
        String string1 = sc.nextLine();
        String string2 = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
            string2 = string2 + string1.charAt(i);
        }
        System.out.println(string2);
        sc.close();
    }
}