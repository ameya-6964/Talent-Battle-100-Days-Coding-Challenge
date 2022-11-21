/* 
* Day 5 
* Get the value of x and y coordinates as input from the user and check in which quadrant the point lies and print it.

* Input
* 10 20
* Output
* This point lies in first quadrant.

* Input
* -10 20
* Output
* This point lies in second quadrant.
*/

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Value For x Co-ordinate");
        int x = sc.nextInt();
        System.out.println("Please Enter Value For y Co-ordinate");
        int y = sc.nextInt();
        if (x > 0 && y > 0) // First Quadrant Condition
        {
            System.out.println("This point lies in first quadrant.");
        } else if (x < 0 && y > 0) // Second Quadrant Condition
        {
            System.out.println("This point lies in Second quadrant.");
        } else if (x < 0 && y < 0) // Third Quadrant Condition
        {
            System.out.println("This point lies in Third quadrant.");
        } else if (x > 0 && y < 0) // Fourth Quadrant Condition
        {
            System.out.println("This point lies in Fourth quadrant.");
        } else // Origin Point Condition
        {
            System.out.println("This Point Is Origin");
        }
        sc.close();
    }
}
