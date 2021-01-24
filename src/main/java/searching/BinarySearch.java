package searching;

public class BinarySearch {
    public static boolean searchNumber(int[] array, int searched) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + ((high - low)/2);
            int guess = array[mid];
            if (searched == guess) {
                return true;
            }
            if (guess > searched) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }
}
