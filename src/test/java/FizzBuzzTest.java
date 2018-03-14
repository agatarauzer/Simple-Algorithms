import org.junit.Test;
import org.junit.Assert;
import other.*;

public class FizzBuzzTest {


    @Test
    public void for1_ShouldReturn1() {
        Assert.assertEquals("1", FizzBuzz.createFizzBuzz(1));
    }

    @Test
    public void for3_ShouldReturnFizz() {
        Assert.assertEquals("Fizz", FizzBuzz.createFizzBuzz(3));
    }

    @Test
    public void for5_ShouldReturnBuzz() {
        Assert.assertEquals("Buzz", FizzBuzz.createFizzBuzz(5));
    }

    @Test
    public void for15_ShouldReturnFizzBuzz() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.createFizzBuzz(15));
    }
}
