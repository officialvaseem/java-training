public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam"; // Example string
        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is Not a Palindrome");
    }
}