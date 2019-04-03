package cn.yq.ssm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.yq.ssm.pojo.Dept;
import cn.yq.ssm.service.DeptService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class DeptServiceTest {
	@Autowired
	private DeptService service;
	
	@Test
	public void testSelectByPrimaryKey() {
		Dept dept = service.selectByPrimaryKey(2);
		System.out.println(dept);
		
	}

	@Test
	public void testSelectByCondition() {
		List<Dept> list = service.selectByCondition();
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}

	@Test
	public void testUpdateByPrimaryKey() {
		Dept dept = new Dept();
		dept.setId(2);
		dept.setName("销售部");
		service.updateByPrimaryKey(dept);
	}

	@Test
	public void testDeleteByPrimaryKey() {
		service.deleteByPrimaryKey(1);
	}

	@Test
	public void testInsert() {
		Dept dept = new Dept();
		dept.setName("开发部");
		dept.setManager("吕哲");
		service.insert(dept);
	}

}
