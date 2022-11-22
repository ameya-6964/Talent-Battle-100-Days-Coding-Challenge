import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month Between 1-12");
        int month = sc.nextInt();
        System.out.println("Enter Year in XXXX Format");
        int year = sc.nextInt();
        /* Months Which Has 31 Days Condition */
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.print("Number of days is 31");
        }
        /* Leap Year Condition */
        else if (((month == 2) && (year % 400 == 0)) || ((year % 100 != 0) && (year % 4 == 0))) {
            System.out.print("Number of days is 29");
        }
        /* Not a Leap Year Condition */
        else if (month == 2) {
            System.out.print("Number of days is 28");
        }
        /* Months Which Has 30 days Condition */
        else {
            System.out.println("Number of days is 30");
        }
        sc.close();
    }
}
