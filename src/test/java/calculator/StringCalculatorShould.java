package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

	@Test
	void empty_string_should_return_0() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void string_with_single_number_should_return_number_as_int() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	void string_with_two_number_should_return_sum() {

		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(3, stringCalculator.add("1,2"));
	}

	@Test
	void string_with_three_number_should_return_sum() {

		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(6, stringCalculator.add("1,2;3"));
	}

	@Test
	void string_with_three_number_should_return_sum_1() {

		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(10, stringCalculator.add("1,2;3\n\n4"));
	}

	@Test
	void HandleSumGreaderThan1000() {

		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(5, stringCalculator.add("800:45,55%105"));
	}

	@Test
	void delimiterWithVariableLength() {

		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(12, stringCalculator.add("//[***]2***5***5"));

	}

	@Test
	void delimiterWithMultipledelimiter() {

		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(6, stringCalculator.add("//[*][%]\\n1*2%3"));

	}

	@Test
	void getNumberOfCallOfAddMethod() {

		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(8, stringCalculator.GetCalledCount());

	}

}
