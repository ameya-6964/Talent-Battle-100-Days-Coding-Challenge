import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        int length = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String newString = "";
        String[] str1 = str.split("\\s");
        for (String string : str1) {
            length = string.length();
            String firstLetter = string.substring(0, 1);
            String remaining = string.substring(1, length - 1);
            String lastLetter = Character.toString(string.charAt(length - 1));
            newString = newString + firstLetter.toUpperCase() + remaining + lastLetter.toUpperCase();
        }
        System.out.println(newString);
        sc.close();
    }
}
