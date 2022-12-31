import java.util.Scanner;

public class Day42 {
    static void sort(int arr[], int n1) {
        int i = 0;
        int j = 0;
        for (i = 0; i < n1 - 1; i++) {
            for (j = 0; j < n1 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int arrays(int arr1[], int arr2[], int n1, int n2) {
        sort(arr1, n1);
        sort(arr2, n2);
        int i = 0;
        int count = 0;
        for (i = 0; i < n1; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array ");
        n1 = sc.nextInt();
        System.out.println("Enter the size of second array ");
        n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n1];
        System.out.println("Enter the elements of first array ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of second array ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        if (arrays(arr1, arr2, n1, n2) != n1) {
            System.out.print("Not same");
        } else {
            System.out.print("Same");
        }
        sc.close();
    }
}