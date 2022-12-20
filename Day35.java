import java.util.Scanner;;

public class Day35 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String With Numbers");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {

                sum = sum + Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
