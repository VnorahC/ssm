package cn.yq.ssm.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.yq.ssm.pojo.User;
import cn.yq.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserServiceTest {
	
	
	@Autowired
	private UserService service;
	
	@Test
	public void testSelectByPrimaryKey() {
		
		User user = service.selectByPrimaryKey(1);
		
		System.out.println(user);
		
	}

	@Test
	public void testSelectByCondition() {
		List<User> users = service.selectByCondition();
		for (User user : users) {
			System.out.println(user);
		}
	}

	@Test
	public void testUpdateByPrimaryKey() {
		User user = new User();
		user.setId(3);
		user.setUsername("张三");
		service.updateByPrimaryKey(user);
	}

	@Test
	public void testDeleteByPrimarykey() {
		service.deleteByPrimaryKey(3);
	}

	@Test
	public void testInsert() {
		User user = new User(null, "张无忌1", "zwj", "wu@qq.com", "123123213", new Date());
		
		int row = service.insert(user);
		System.out.println(row);
	}

}
