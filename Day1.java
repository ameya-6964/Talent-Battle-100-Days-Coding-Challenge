
/*     
* DAY 1
*Take an input character from the user and check whether the given input is a vowel or consonant.

* Input
* A
* Output
* Vowel

* Input
* m
* Output
* Consonant

* Input
* 3
* Output
* Invalid Input
 */
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Character");
        char ch = sc.next().charAt(0);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println("Consonent");
        } else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}