package spring.test.ch02.ex01;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyAssert {
	@Test
	public void test(){
		assertEquals(3,3);
	}
	
	@Test
	public void test2(){
		assertEquals(3,2);
	}
	
	@Test
	public void test3(){
		assertEquals("다릅니다", 3,2);
	}
}
