package spring.test.ch01.ex02.case01;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import spring.test.ch01.ex02.Nums;

public class NumsTest {
	@Test
	public void testNegativeNum(){
		Nums nums = new Nums(Arrays.asList(-1,-2,-3));
		assertEquals(-1, nums.getGreatest());
	}
}
