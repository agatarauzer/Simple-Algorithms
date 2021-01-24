package searching;

public class BinarySearch {
    public static boolean searchNumber(int[] array, int searched) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + ((high - low)/2);
            if (array[mid] > searched) {
                high = mid - 1;
            }
            else if (array[mid] < searched) {
                low = mid + 1;
            }
            else return true;
        }
        return false;
    }
}
