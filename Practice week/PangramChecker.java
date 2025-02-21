import java.util.HashSet;

public class PangramChecker {

    public static boolean isPangram(String str) {
        return str.toLowerCase().chars()
                  .filter(Character::isLetter)
                  .distinct()
                  .count() == 26;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("I dont want Aslam and Thameem to be Close Friends"));  // Output: false
    }
}

