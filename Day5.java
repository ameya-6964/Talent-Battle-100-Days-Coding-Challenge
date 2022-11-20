
/* 
* Day 4 
*coding Statement: Get a number as input from the user and check whether the given number is odd or even

* Input
* 10
* Output
* Even

* Input
* 5
* Output
* Odd
*/
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) // Even Number Logic
        {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}