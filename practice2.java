import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        double interior = 18.00;
        double exterior = 12.00;
        double cost = 0.00;
        double temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Interior Walls");
        int wallI = sc.nextInt();
        System.out.println("Enter Number Of Exterior Walls");
        int wallE = sc.nextInt();
        if (wallI < 0 || wallE < 0) {
            System.out.println("Invalid Input");
        } else if (wallI == 0 && wallE == 0) {
            System.out.println("Total Estimated Cost = " + cost + " INR");
        } else {
            for (int i = 1; i <= wallI; i++) {
                System.out.println("Please Enter Sq Feet For " + i + " Interior Walls");
                temp = sc.nextDouble();
                cost = cost + (interior * temp);
            }
            for (int i = 1; i <= wallE; i++) {
                System.out.println("Please Enter Sq Feet For " + i + " Exterior Walls");
                temp = sc.nextDouble();
                cost = cost + (exterior * temp);
            }
            System.out.println("Total Estimated Cost = " + cost + " INR");
        }
        sc.close();

    }
}