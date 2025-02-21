import java.util.Arrays;

public class RotateArray2 {

    // Method to rotate the array anticlockwise by k positions
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // Handle cases where k is greater than the array length
        
        // Reverse the whole array
        reverse(arr, 0, n - 1);
        
        // Reverse the first n-k elements
        reverse(arr, 0, n - k - 1);
        
        // Reverse the remaining k elements
        reverse(arr, n - k, n - 1);
    }

    // Helper method to reverse the array from 'start' to 'end' indices
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Input array and k value
        int[] arr = {1, 2, 3, 4, 5};
        
        // Rotate the array by 1 position anticlockwise
        rotate(arr, 1);

        // Output the rotated array
        System.out.println(Arrays.toString(arr));  // Output: [2, 3, 4, 5, 1]
    }
}

