import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int i = 0;
        char ch[] = str.toCharArray();
        for (char c : ch) {
            i++;
        }
        System.out.println(i);
        sc.close();
    }
}
