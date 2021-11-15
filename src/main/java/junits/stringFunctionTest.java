package junits;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class stringFunctionTest {

	@Test
	@DisplayName("PositiveTest")
	public void test1() {
		assertTrue(StringFunction.isPlaindrome("oppo"));
	}
	@Test
	@DisplayName("NegativeTest")
	public void test2() {
		assertFalse(StringFunction.isPlaindrome("abcd"));
	}
	

}
