package com.sshproject.employee.dao;

import com.sshproject.employee.domain.Department;

import java.util.List;

/**
 * Created by yunfei on 2017/2/5.
 */
public interface DepartmentDao {

    int findCount();

    List<Department> findByPage(int begin,int pageSize);

    void save(Department department);

    Department findById(Integer did);

    void update(Department department);

    void delete(Department department);
}
