public class Mergealternatively {
    // Method to merge two strings alternatively
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        int m = word1.length();
        int n = word2.length();
        while (i < m || i < n) {
            if (i < m) {
                sb.append(word1.charAt(i));
            }
            if (i < n) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Mergealternatively obj = new Mergealternatively();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(obj.mergeAlternately(word1, word2));  // Output: "adbcefg"
    }
}
