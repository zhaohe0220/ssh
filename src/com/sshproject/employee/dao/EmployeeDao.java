package com.sshproject.employee.dao;

import com.sshproject.employee.domain.Employee;

/**
 * Created by yunfei on 2017/2/5.
 */
public interface EmployeeDao {
    Employee findUser(Employee employee);
}
