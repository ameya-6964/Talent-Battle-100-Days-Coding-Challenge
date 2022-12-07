public class practice3 {
    public static void main(String[] args) {
        int gcd = 0;
        int a = 12;
        int b = 8;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of number " + a + " and " + b + " is " + gcd);
        int lcm = a * b / gcd;
        System.out.println("LCM of number " + a + " and " + b + " is " + lcm);
    }

}
