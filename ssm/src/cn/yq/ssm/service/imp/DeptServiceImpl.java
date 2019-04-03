package cn.yq.ssm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yq.ssm.mapper.DeptMapper;
import cn.yq.ssm.pojo.Dept;
import cn.yq.ssm.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptMapper deptMapper;
	
	
	@Override
	public Dept selectByPrimaryKey(Integer id) {
		return deptMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Dept> selectByCondition() {
		// TODO Auto-generated method stub
		return deptMapper.selectByCondition();
	}

	@Override
	public int updateByPrimaryKey(Dept dept) {
		// TODO Auto-generated method stub
		return deptMapper.updateByPrimaryKey(dept);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return deptMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Dept dept) {
		// TODO Auto-generated method stub
		return deptMapper.insert(dept);
	}

}
