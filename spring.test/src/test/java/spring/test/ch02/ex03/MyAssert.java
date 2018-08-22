package spring.test.ch02.ex03;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;
import java.util.Date;
import org.junit.Test;

public class MyAssert {
	@Test
	public void test(){
		assertSame(new Date(), new Date());
	}
	
	@Test
	public void test2(){
		assertNotSame(new Date(), new Date());
	}
}
