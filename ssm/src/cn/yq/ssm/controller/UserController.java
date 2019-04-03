package cn.yq.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.yq.ssm.pojo.Dept;
import cn.yq.ssm.pojo.User;
import cn.yq.ssm.service.DeptService;
import cn.yq.ssm.service.UserService;
import sun.print.resources.serviceui;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private DeptService deptService;
	@Autowired
	private UserService userService;
	
	/**
	 * 查询所有用户
	 * @param m
	 * @return
	 */
	@RequestMapping("/userlist.do")
	public String userList(Model m) {
		//查询所有用户
		List<User> users = userService.selectByCondition();
		//查询所有部门
		List<Dept> depts = deptService.selectByCondition();
		//共享数据
		m.addAttribute("users", users);
		m.addAttribute("depts",depts);
		return "find";
	}
	
	/**
	 * 删除指定id用户
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete.do")
	public String delete(Integer id) {
		System.out.println("id:"+id);
		if(id != null) {
			userService.deleteByPrimaryKey(id);
		}
		return "redirect:/user/userlist.do";//删除信息后一定要使用重定向返回页面
	}
	
	/**
	 * 编辑操作
	 * @param id
	 * @param m
	 * @return
	 */
	@RequestMapping("/userEdit.do")
	public String edit(Integer id,Model m) {
		if(id !=null) {
			User user = userService.selectByPrimaryKey(id);
			m.addAttribute("user",user);
		}
		return "userEdit";
	}
	
	/**
	 * 新增或修改操作
	 * @param user
	 * @return
	 */
	@RequestMapping("/saveOrupdate.do")
	public String savaOrupdate(User user) {
		System.out.println(user);
		if(user.getId()!=null) {
			//id不为空执行修改操作
			userService.updateByPrimaryKey(user);
		}else {
			//id为空执行新增操作
			userService.insert(user);
		}
		return "redirect:/user/userlist.do";
	}
	
	
	/**
	 * 删除指定id部门
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteDept.do")
	public String deleteDept(Integer id) {
		System.out.println("id:"+id);
		if(id != null) {
			deptService.deleteByPrimaryKey(id);
		}
		return "redirect:/user/userlist.do";
	}
	
	/**
	 * 判断部门id并将信息共享给deptEdit界面
	 * @param m
	 * @param id
	 * @return
	 */
	@RequestMapping("/deptEdit.do")
	public String deptEdit(Model m,Integer id) {
		if(id != null) {
			Dept dept = deptService.selectByPrimaryKey(id);
			m.addAttribute("dept", dept);
		}
		return "deptEdit";
	}
	
	/**
	 * 新增部门或修改部门
	 * @param dept
	 * @return
	 */
	@RequestMapping("/insertOrupdate.do")
	public String insertOrupdate(Dept dept) {
		System.out.println(dept);
		if(dept.getId() != null) {
			deptService.updateByPrimaryKey(dept);
		}else {
			deptService.insert(dept);
		}
		return "redirect:/user/userlist.do";
	}
	
}

