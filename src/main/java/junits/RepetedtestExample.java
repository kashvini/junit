package junits;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

public class RepetedtestExample {

	@RepeatedTest(4)
	public void test1() {
		
			assertTrue(StringFunction.isPlaindrome("oppo"));

	}
}

