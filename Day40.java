import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Enter the substring to be removed");
        String removedString = sc.nextLine();
        System.out.println("Enter the new substring");
        String newstring = sc.nextLine();
        String replacestring = str.replace(removedString, newstring);
        System.out.println("New String is :" + replacestring);
        sc.close();
    }
}
