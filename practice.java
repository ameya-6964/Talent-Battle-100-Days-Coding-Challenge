import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        int n = 10;
        int k = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Candies You Want");
        int candies = sc.nextInt();
        if (candies >= 1 && candies <= k) {
            System.out.println("Number Of Candies Sold are " + candies);
            System.out.println("Number Of Candies Left In Jar are are " + (n - candies));
        } else if (candies > k) {
            System.out.println("Jar Can Only Give 5 Candies At one Time");
            System.out.println("Number Of Candies Left In Jar are " + n);
        } else {
            System.out.println("Invalid Input");
            System.out.println("Number Of Candies Left In Jar are " + n);
        }

        sc.close();

    }
}
