import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int newnumber = 0;
        if (num == 0)
            newnumber = 1;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0)
                rem = 1;
            num = num / 10;
            newnumber = newnumber * 10 + rem;
        }
        num = 0;
        while (newnumber > 0) {
            int r = newnumber % 10;
            num = num * 10 + r;
            newnumber = newnumber / 10;
        }
        System.out.println("New number is: " + num);
        sc.close();
    }
}