import java.util.Scanner;
public class Day32 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String s1 = "";
        s1 = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(s1);
        sc.close();
    }
}
