
/* 
* Day 4 
*coding Statement:  Write a program to identify of the a number is positive or negative

* Input : -10
* Output : Negative number

* Input :0
* Output : Neither positive nor negative

* Input :15
* Output : Positive number
*/
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Neither positive nor Negative ");
        }
        sc.close();
    }

}
