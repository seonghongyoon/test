package spring.test.ch03.ex01.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import spring.test.ch03.ex01.dao.UserDao;
import spring.test.ch03.ex01.domain.Level;
import spring.test.ch03.ex01.domain.User;

public class UserServiceTest {
	private List<User> users;
	
	@Before
	public void setUp(){
		users = Arrays.asList(
			new User("최한석", Level.BASIC, 9),
			new User("최판돌", Level.BASIC, 9),
			new User("한아름", Level.BASIC, 9),
			new User("한승일", Level.BASIC, 9),
			new User("라다희", Level.BASIC, 9));
	}
	
	@Test
	public void upgradeLevels() throws Exception{
		UserDao userDao = mock(UserDao.class);
		when(userDao.getUsers()).thenReturn(this.users);
		UserServiceImpl userService = new UserServiceImpl();
		userService.setUserDao(userDao);
		
		userService.upgradeLevels();
		
		verify(userDao, times(2)).update(any(User.class));
		verify(userDao, times(2)).update(any(User.class));
		assertThat(users.get(1).getLevel(), is(Level.SILVER));
		verify(userDao).update(users.get(3));
		assertThat(users.get(3).getLevel(), is(Level.GOLD));
		
		assertThat(users.get(0).getLevel(), is(Level.BASIC));
		assertThat(users.get(2).getLevel(), is(Level.SILVER));
		assertThat(users.get(4).getLevel(), is(Level.GOLD));
	}
}
