package Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.csc.util.MyTest;

public class Sampletest {

	
	MyTest test;
	
	/*@Before
	public void init(){
		test = new MyTest();
	}*/
	
	
	@Test
	public void testSample(){
		test = new MyTest();
		
		String str = "My Java Test Program";
		
		Assert.assertEquals("My Java Test Program", test.getMessage());
		
		test.setMessage("hello");
		
		Assert.assertEquals("hello", test.getMessage());
	}
}
