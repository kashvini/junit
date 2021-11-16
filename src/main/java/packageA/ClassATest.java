package packageA;

import static org.testng.AssertJUnit.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunction;

public class ClassATest {

	@Tag("Sanity")
	@DisplayName("Test1")
	@Test
	public void Test1() {
		assertTrue(StringFunction.isPlaindrome(null));
	}
	
}
