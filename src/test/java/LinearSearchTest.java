import org.junit.Assert;
import org.junit.Test;
import searching.BinarySearch;
import searching.LinearSearch;

public class LinearSearchTest {

    private int[] array = {1,3,5,7,8,9,10,15,23,45,78,99};

    @Test
    public void searching15shouldReturnTrue() {
        Assert.assertTrue(LinearSearch.searchNumber(array, 15));
    }

    @Test
    public void searching77shouldReturnFalse() {
        Assert.assertFalse(LinearSearch.searchNumber(array, 77));
    }
}
