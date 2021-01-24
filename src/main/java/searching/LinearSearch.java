package searching;

public class LinearSearch {
    public static boolean searchNumber(int[] array, int searched) {
        for (int i = 0; i < array.length; i++) {
            if (searched == array[i]) {
                return true;
            }
        }
        return false;
    }
}
