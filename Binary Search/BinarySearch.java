import java.util.List;

public class BinarySearch {

    public static int binarySearch(List<Integer> L, int x) {
        int low = 0, high = L.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;  // Integer division

            if (L.get(mid) == x) {
                return mid;  // Found x at position mid
            } else if (L.get(mid) < x) {
                low = mid + 1;  // Search in the right half
            } else {
                high = mid - 1;  // Search in the left half
            }
        }
        return -1;  // x not found in L
    }

    public static void main(String[] args) {
        List<Integer> L = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (int x = 1; x <= 10; x++) {
            int position = binarySearch(L, x);
            
            if (position == -1) {
                System.out.println(x + " not found in the list.");
            } else {
                System.out.println(x + " found at position " + position + ".");
            }
        }
        System.out.println("Program terminated.");
    }
}
