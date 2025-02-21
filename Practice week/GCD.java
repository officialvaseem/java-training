public class GCD{
    public static void main(String[] args) {
        int a = 56, b = 98; 
        int gcd;

        if (a < b) {
            gcd = a; 
        } else {
            gcd = b;
        }

        while (gcd > 0) {
            if (a % gcd == 0 && b % gcd == 0) {
                System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
                break;
            }
            gcd--; 
        }
    }
}