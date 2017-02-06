package com.sshproject.employee.dao.impl;

import com.sshproject.employee.dao.EmployeeDao;
import com.sshproject.employee.domain.Employee;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by yunfei on 2017/2/5.
 */
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {
    @Override
    public Employee findUser(Employee employee) {
        String hql = "from Employee where username = ? and password = ?";
        List<Employee> list = (List<Employee>) this.getHibernateTemplate().find(hql,employee.getUsername(),employee.getPassword());
        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
