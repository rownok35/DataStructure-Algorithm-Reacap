import java.util.Arrays;

public class SelectionSort {
    /**
     * Sorts an array of integers in ascending order using the selection sort algorithm.

     * Time Complexity: O(n^2), where n is the number of elements in the array. 
     * This is due to the nested loops iterating through the array.
     * 
     * Space Complexity: O(1), as sorting is done in-place and does not require extra space.
     * 
     * @param arr an array of integers to be sorted in ascending order
     */
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;  // Get the number of elements in the array

        // Traverse the array and select the minimum element for each position
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;  // Assume the first unsorted element is the minimum

            // Find the index of the smallest element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Update the index of the minimum element
                }
            }

            // Swap the found minimum element with the first unsorted element if needed
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
    }

    /**
     * Helper method to swap two elements in the array.
     * 
     * @param arr the array in which elements are to be swapped
     * @param i the index of the first element to be swapped
     * @param j the index of the second element to be swapped
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // Example usage of the selectionSort method
        int[] arr = {5, 2, 3, 1, 4};
        System.out.println("Before sort: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("After sort: " + Arrays.toString(arr));
    }
}
