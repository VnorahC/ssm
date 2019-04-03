package cn.yq.ssm.mapper;

import java.util.List;

import cn.yq.ssm.pojo.Dept;

public interface DeptMapper {
	/**
	 * 根据主键查询部门
	 * @param id
	 * @return
	 */
	Dept selectByPrimaryKey(Integer id);
	
	/**
	 * 条件查询 查找所有部门
	 * @return
	 */
	List<Dept> selectByCondition();
	
	
	/**
	 * 根据主键修改部门
	 * @param dept
	 * @return
	 */
	int updateByPrimaryKey(Dept dept);
	
	/**
	 * 根据主键删除部门
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Integer id);
	
	/**
	 * 新增部门
	 * @param dept
	 * @return
	 */
	int insert(Dept dept);
}
