package com.sshproject.employee.service.impl;

import com.sshproject.employee.dao.EmployeeDao;
import com.sshproject.employee.service.EmployeeService;

/**
 * Created by yunfei on 2017/2/5.
 */
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

}
