package spring.test.ch01.ex01.case02;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.*;
import spring.test.ch01.ex01.Nums;

public class NumsTest {
	@Test
	public void testNegativeNum(){
		Nums nums = new Nums(Arrays.asList(-1,-2,-3));
		assertEquals(-1, nums.getGreatest());
	}
}
