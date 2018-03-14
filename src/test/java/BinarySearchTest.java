import org.junit.Assert;
import org.junit.Test;
import searching.BinarySearch;

public class BinarySearchTest {

    private int[] array = {1,3,5,7,8,9,10,15,23,45,78,99};

    @Test
    public void searching7shouldReturnTrue() {
        Assert.assertTrue(BinarySearch.searchNumber(array, 7));
    }

    @Test
    public void searching12shouldReturnFalse() {
        Assert.assertFalse(BinarySearch.searchNumber(array, 12));
    }

}
