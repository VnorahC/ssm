package cn.yq.ssm.service;

import java.util.List;

import cn.yq.ssm.pojo.User;

public interface UserService {
	User selectByPrimaryKey(Integer id);
	
	List<User> selectByCondition();
	
	int updateByPrimaryKey(User user);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(User user);
}
