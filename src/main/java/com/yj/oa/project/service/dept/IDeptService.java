package com.yj.oa.project.service.dept;

import com.yj.oa.project.po.Dept;

import java.util.List;

/**
 * @author 永健
 * @date 2018/9/15 13:40
 * @描述
 */
public interface IDeptService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated
     */
    int deleteByPrimaryKeys(String[] depId) throws Exception ;



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated
     */
    int insertSelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated
     */
    Dept selectByPrimaryKey(String depId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Dept record) throws Exception;

    /**
     *
     * @描述 部门列表
     *
     * @date 2018/9/15 13:39
     */
    List<Dept> selectDeptList(Dept dept);

    /**
     * 校验部门名称是否唯一
     *
     * @param dept 部门信息
     * @return 结果
     */
    public String checkDeptNameUnique(Dept dept);

    /**
     *
     * @描述: 查询所有部门下的所有用户 用户归类 树状数据
     *
     * @date: 2018/9/27 11:25
     */
    List<Dept> selectDeptAndUser();
}
