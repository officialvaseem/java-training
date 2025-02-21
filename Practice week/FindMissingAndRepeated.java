import java.util.HashSet;

public class FindMissingAndRepeated {
    public static void findNumbers(int[] arr, int n) {
        HashSet<Integer> seen = new HashSet<>();
        int sum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0, repeated = -1;

        for (int num : arr) {
            if (!seen.add(num)) {
                repeated = num; // Found repeated number
            }
            actualSum += num;
        }

        int missing = sum - (actualSum - repeated);
        System.out.println("Missing is " + missing + " and Repeated is " + repeated);
    }

    public static void main(String[] args) {
        int[] input = {4, 3, 6, 2, 1, 1};
        findNumbers(input, 6);
    }
}

