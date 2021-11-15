package junits;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertionExamples {

	@Test
	public void test() {
		String name1 = "ashvini";
		String name2 = "ashvini";
		
		assertEquals(name1,name2);
		
		
		String[] expectedArray = {"one","two","three"};
		String[] actualArray = {"one","two","three"};
		
		assertArrayEquals(expectedArray,actualArray);

	}

}

