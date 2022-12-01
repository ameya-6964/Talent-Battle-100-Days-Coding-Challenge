import java.util.Scanner;
public class Day16 
{
    public static void main(String[] args) 
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int number = sc.nextInt();
        for (int i = 1; i <= number / 2; i++) 
        {
            if (number % i == 0) 
            {
                sum = sum + i;
            }
        }
        if (sum == number)
        {
            System.out.println("Perfect Number");
        } else
        {
            System.out.println("Not a Perfect Number");
        }
        sc.close();
    }
}
