package sorting;

public class SelectionSort {

    public static int[] sortArray(int[] array) {

        int minIndex;
        int temp;
        for (int i = 0; i < array.length; i++) {
            minIndex = findMinIndex(array, i);
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    private static int findMinIndex(int[] array, int fromIndex) {

        int min = array[fromIndex];
        int index = fromIndex;

        for (int i = fromIndex; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
