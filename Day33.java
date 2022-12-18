import java.util.Scanner;

public class Day33 {
    static boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        if (isPalindrome(string)) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not a palindrome");
        }
        sc.close();
    }
}