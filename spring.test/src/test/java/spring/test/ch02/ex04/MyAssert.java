package spring.test.ch02.ex04;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MyAssert {
	@Test
	public void test(){
		assertTrue(true);
	}
	
	@Test
	public void test2(){
		assertTrue(true);
	}
	
	@Test
	public void test3(){
		assertFalse(false);
	}
	@Test
	public void test4(){
		assertFalse(false);
	}
}
