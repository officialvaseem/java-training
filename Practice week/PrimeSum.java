public class PrimeSum {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int L = 10, R = 50; // Example range
        int sum = 0;

        for (int i = L; i <= R; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Sum of primes from " + L + " to " + R + " is: " + sum);
    }
}