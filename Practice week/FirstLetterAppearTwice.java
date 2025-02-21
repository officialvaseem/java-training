import java.util.HashSet;
public class FirstLetterAppearTwice {
    public static char firstLetterTwice(String str) {
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (seen.contains(currentChar)) {
                return currentChar;
            } 
            seen.add(currentChar);
        }
        return '-';
    }

    public static void main(String[] args) {
        String input = "abccbaacz";
        char result = firstLetterTwice(input);
        System.out.println(result);  
    }
}
