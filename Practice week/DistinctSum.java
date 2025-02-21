import java.util.HashMap;
import java.util.Map;

public class DistinctSum {
    public static int distinctSum(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 2, 3};
        int[] input2 = {1, 3, 2, 3};

        System.out.println(distinctSum(input1)); // Output: 1
        System.out.println(distinctSum(input2)); // Output: 4
    }
}


