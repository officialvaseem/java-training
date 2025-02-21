public class CheckPalindrome {
    public static boolean isPalindrome(int num) {
        if (num < 0) return false; // Negative numbers are not palindromes

        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(22));   // Output: true
    }
}



