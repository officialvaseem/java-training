public class option2 {
    public static void main(String[] args) {
        // You can directly assign the values of N and OPT here
        int N = 6;  // Set the value of N
        int OPT = 2;  // Set the value of OPT (1 or 2)
        
        // Variable to store the result
        int result = 0;
        
        if (OPT == 1) {
            // For OPT = 1, subtract and add alternatively, starting with subtraction
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    result += (N - i); // Addition when i is even
                } else {
                    result -= (N - i); // Subtraction when i is odd
                }
            }
        } else if (OPT == 2) {
            // For OPT = 2, add and subtract alternatively, starting with addition
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    result += (N - i); // Addition when i is even
                } else {
                    result -= (N - i); // Subtraction when i is odd
                }
            }
        } else {
            System.out.println("Invalid option. Please enter either 1 or 2.");
            return;
        }
        
        // Output the result
        System.out.println("The result is: " + result);
    }
}
