package com.sshproject.employee.action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sshproject.employee.domain.Department;
import com.sshproject.employee.domain.PageBean;
import com.sshproject.employee.service.DepartmentService;

/**
 * Created by yunfei on 2017/2/5.
 */
public class DepartmentAction extends ActionSupport implements ModelDriven<Department> {

    private Department department = new Department();

    @Override
    public Department getModel() {
        return department;
    }


    private Integer currPage = 1;
    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    private DepartmentService departmentService;

    //查询方法
    public String findAll(){
        PageBean<Department> pageBean = departmentService.findByPage(currPage);
        ActionContext.getContext().getValueStack().push(pageBean);
        return "findAll";
    }

    public String saveUI(){
        return "saveUI";
    }

    public String save(){
        departmentService.save(department);
        return "saveSuccess";
    }

    public String edit(){
        department = departmentService.findById(department.getDid());
        return "editSuccess";
    }

    public String update(){
        departmentService.update(department);
        return "updateSuccess";
    }

    public String delete(){
        department = departmentService.findById(department.getDid());
        departmentService.delete(department);
        return "deleteSuccess";
    }
}
