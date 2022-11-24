import java.util.Scanner;
public class Day8 
{
    public static void main(String[] args) 
    {
        double firstroot = 0;
        double secondroot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Value For a : ");
        double a = sc.nextDouble();
        System.out.println("Please Enter Value For b : ");
        double b = sc.nextDouble();
        System.out.println("Please Enter Value For c : ");
        double c = sc.nextDouble();
        double determinant = (b * b) - (4 * a * c);
        double squareroot = Math.sqrt(determinant);
        if (determinant > 0) 
        {
            firstroot = (-b + squareroot) / (2 * a);
            secondroot = (-b - squareroot) / (2 * a);
            System.out.println("Roots Are Diffrent");
            System.out.println("Root 1 = " + firstroot + "Root 2 = " + secondroot);
        } 
        else if (determinant == 0) 
        {
            System.out.println("Roots Are Equal ");
            System.out.println("Root 1 = Root 2 = " + (-b + squareroot) / (2 * a));
        } 
        else 
        {
            System.out.println("Roots Are Complex and Diffrent");
        }
        sc.close();
    }
}
