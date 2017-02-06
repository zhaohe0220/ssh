package com.sshproject.employee.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sshproject.employee.domain.Employee;
import com.sshproject.employee.service.EmployeeService;

/**
 * Created by yunfei on 2017/2/5.
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {
    private EmployeeService employeeService;
    private Employee employee = new Employee();

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee getModel() {
        return employee;
    }


    public String action(){
        System.out.println("qwwer");
        return NONE;
    }

    public String save(){
        System.out.println("success");
        return NONE;
    }

    public String test(){
        System.out.println("ee");
        return NONE;
    }





}
