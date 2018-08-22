package spring.test.ch02.ex06.case02;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({spring.test.ch02.ex01.MyAssert.class,
	spring.test.ch02.ex02.MyAssert.class})
public class AllTests {

}
