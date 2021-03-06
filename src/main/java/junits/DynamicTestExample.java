package junits;

import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import static org.junit.jupiter.api.Assertions.*;


public class DynamicTestExample {
	
	@TestFactory
	public Collection<DynamicTest> method1() {
		
		return Arrays.asList(
				
		DynamicTest.dynamicTest("Positive test", 
				() -> assertTrue(StringFunction.isPlaindrome("oppo"))),
		
		DynamicTest.dynamicTest("Positive test", 
				() -> assertTrue(StringFunction.isPlaindrome("madam"))),
		
		DynamicTest.dynamicTest("Negative test", 
				() -> assertFalse(StringFunction.isPlaindrome("abcd")))
		
		);
		
		
	}

}