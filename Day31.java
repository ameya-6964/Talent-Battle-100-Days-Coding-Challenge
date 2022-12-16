import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Random String : ");
        String string1 = sc.nextLine();
        String temp = "";
        for (int i = 0; i < string1.length(); i++) {
            if (Character.isUpperCase(string1.charAt(i))) {
                temp = temp + Character.toLowerCase(string1.charAt(i));
            } else {
                temp = temp + Character.toUpperCase(string1.charAt(i));
            }
        }
        sc.close();
        System.out.println(temp);
    }
}