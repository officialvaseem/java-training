public class PrintFromMiddle {
    public static void printFromMiddle(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(s.length() / 2, s.length() - i + s.length() / 2));
        }
    }

    public static void main(String[] args) {
        String input = "PROGRAM";
        printFromMiddle(input);
    }
} 
