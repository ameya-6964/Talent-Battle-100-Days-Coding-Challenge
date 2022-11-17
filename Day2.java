
/*  
* DAY 2
* Description: Take an input character from user and check whether it is an alphabet or not.

* Input : A
* Output:  Alphabet

* Input: 7
* Output: Not an alphabet
*/
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Character");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not an alphabet");
        }
        sc.close();
    }
}
