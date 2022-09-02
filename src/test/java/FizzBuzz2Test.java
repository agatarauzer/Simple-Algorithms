import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import other.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {
	
	
	// If number is divisible by 3, print Fizz
	// If number is divisible by 5, print Buzz
	// If number is divisible by 3 and 5, print FizzBuzz
	// If number is NOT divisible by 3 or 5, then print the number.
	
	FizzBuzz fizzBuzz = new FizzBuzz();

	@DisplayName("Divisible by Three")
	@Test
	@Order(1)
	void testForDivisibleByThree() {
		
		String expected = "Fizz";
		
		assertEquals(expected, fizzBuzz.compute(3), "Should return Fizz");
	}
	
	@DisplayName("Divisible by Five")
	@Test
	@Order(2)
	void testForDivisibleByFive() {
		
		String expected = "Buzz";
		
		assertEquals(expected, fizzBuzz.compute(5), "Should return Buzz");
	}
	
	
	@DisplayName("Divisible by Three and Five")
	@Test
	@Order(3)
	void testForDivisibleByThreeAndFive() {
		
		String expected = "FizzBuzz";
		
		assertEquals(expected, fizzBuzz.compute(15), "Should return FizzBuzz");	
	}
	
	@DisplayName("Not Divisible by Three or Five")
	@Test
	@Order(4)
	void testNotDivisibleByThreeAndFive() {
		
		String expected = "1";
		
		assertEquals(expected, fizzBuzz.compute(1), "Should return 1");	
	}
	
	@DisplayName("Testing with Small data file")
	@ParameterizedTest(name="value={0}, expected={1}")
	@CsvFileSource(resources="/small-test-data.csv")
	@Order(5)
	void testSmallDataFile(int value, String expected) {

		assertEquals(expected, fizzBuzz.compute(value));	
	}
  
  }
