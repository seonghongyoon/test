package spring.test.ch01.ex01.case01;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import spring.test.ch01.ex01.Nums;

public class NumsTest {
	@Test
	public void testGetGreatest(){
		Nums nums = new Nums(Arrays.asList(1,2,3));
		assertEquals(3, nums.getGreatest());
	}
	
	@Test
	public void testGetGreatest2(){
		Nums nums = new Nums(Arrays.asList(1,3,2));
		assertEquals(3, nums.getGreatest());
	}
}
