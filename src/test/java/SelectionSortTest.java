import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import sorting.SelectionSort;

public class SelectionSortTest {

    private static int[] arrayToSort = {899,23,78,103,10,5,92,7,79,7574,124,123};

    @BeforeClass
    public static void sortArray() {
        SelectionSort.sortArray(arrayToSort);
    }

    @Test
    public void index0ShouldContain5() {
        Assert.assertTrue(arrayToSort[0] == 5);
    }

    @Test
    public void lastIndexShouldContain7574() {
        int lastIndex = arrayToSort.length - 1;
        Assert.assertTrue(arrayToSort[lastIndex] == 7574);
    }

}
