import java.util.Scanner;

public class Day46 {
    public static void main(String args[]) {
        int number = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        number = sc.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter the array elements");
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum);
        sc.close();
    }
}