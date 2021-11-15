package junits
;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class FirstJunit {
	@BeforeAll
	public void Method3() {
		System.out.println("Inside of before all");
	}
	
	
	
	
 @BeforeEach
public void Method1() {
	 
	 System.out.println("Inside of Before  Method");
 }
	
	
@Test
	public void test1() {
		System.out.println("Inside Test");
		boolean flag =true;
		Assert.assertTrue(flag);
		
	}
@Test 
public void test2() {
	System.out.println("Inside test2");
}
@AfterEach
 public void Method2() {
	System.out.println("Inside of After Method");
}
 @AfterAll
  public void Method4() {
	 System.out.println("Inside of After Method");
 }
}
