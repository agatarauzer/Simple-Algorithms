package sorting;

public class InsertionSort {
    public static void sort(int[] array) {
        int currInd;
        for (int i = 1; i < array.length; i++) {
            currInd = i;
            while (currInd > 0 && array[currInd] < array[currInd - 1]) {
                swap(array, currInd, currInd - 1);
                currInd -= 1;
            }
        }
    }

    public static int[] swap(int[] arr, int index, int previousIndex) {
        int temp = arr[previousIndex];
        arr[previousIndex] = arr[index];
        arr[index] = temp;
        return arr;
    }
}
