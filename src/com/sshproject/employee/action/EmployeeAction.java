package com.sshproject.employee.action;

import com.opensymphony.xwork2.ActionContext;
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
        Employee existEmployee = employeeService.login(employee);
        if(existEmployee == null){
            this.addActionError("登录失败");
            return INPUT;
        }else {
            ActionContext.getContext().getSession().put("existEmployee",existEmployee);
            return SUCCESS;
        }
    }

    public String test(){
        System.out.println("ee");
        return NONE;
    }





}
