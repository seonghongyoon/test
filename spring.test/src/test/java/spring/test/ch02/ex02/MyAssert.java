package spring.test.ch02.ex02;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import java.util.Date;
import org.junit.Test;

public class MyAssert {
	@Test
	public void test(){
		assertNull(new Date());
	}
	
	@Test
	public void test2(){
		assertNull(null);
	}
	
	@Test
	public void test3(){
		assertNotNull(new Date());
	}
	
	@Test
	public void test4(){
		assertNotNull(null);
	}
}
