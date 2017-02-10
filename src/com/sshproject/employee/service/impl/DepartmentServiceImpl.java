package com.sshproject.employee.service.impl;

import com.sshproject.employee.dao.DepartmentDao;
import com.sshproject.employee.domain.Department;
import com.sshproject.employee.domain.PageBean;
import com.sshproject.employee.service.DepartmentService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yunfei on 2017/2/5.
 */
@Transactional
public class DepartmentServiceImpl implements DepartmentService{

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    private DepartmentDao departmentDao;

    @Override
    public PageBean<Department> findByPage(Integer currPage) {
        PageBean<Department> pageBean = new PageBean<>();
        //封装当前页数
        pageBean.setCurrPage(currPage);
        //封装每页显示记录数
        int pageSize = 3;
        pageBean.setPageSize(pageSize);
        //封装总记录数
        int totalCount = departmentDao.findCount();
        pageBean.setTotalCount(totalCount);
        //总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);
        pageBean.setTotalPage(num.intValue());
        //封装数据
        int begin = (currPage -1) * pageSize;
        List<Department> list = departmentDao.findByPage(begin,pageSize);
        pageBean.setList(list);
        return pageBean;
    }

    @Override
    public void save(Department department) {
        departmentDao.save(department);
    }

    @Override
    public Department findById(Integer did) {
        Department department =  departmentDao.findById(did);
        return department;

    }

    @Override
    public void update(Department department) {
        departmentDao.update(department);
    }

    @Override
    public void delete(Department department) {
        departmentDao.delete(department);
    }
}
