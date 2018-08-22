package spring.test.ch02.ex07;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import spring.test.ch02.ex07.Arith;

public class ArithTest {
	@Test
	public void test(){
		assertEquals(1, new Arith().divide(3, 3));
	}
	
	@Test
	public void test2(){
		try{
			assertEquals(1, new Arith().divide(3, 0));
			fail("테스트 실패입니다.");
		}catch(ArithmeticException e){
			assertTrue(true);
		}
	}
}
