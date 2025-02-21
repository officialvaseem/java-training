public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 45}; // Example array

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE)
            System.out.println("No second largest element");
        else
            System.out.println("Second largest: " + second);
    }
}


