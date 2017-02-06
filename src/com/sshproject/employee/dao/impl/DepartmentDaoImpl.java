package com.sshproject.employee.dao.impl;

import com.sshproject.employee.dao.DepartmentDao;
import com.sshproject.employee.domain.Department;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by yunfei on 2017/2/5.
 */
public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {

    @Override
    public int findCount() {
        String hql = "select count(*) from Department";
        List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
        if(list.size()>0){
            return list.get(0).intValue();
        }
        return 0;
    }

    @Override
    public List<Department> findByPage(int begin, int pageSize) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Department.class);
        List<Department> list = (List<Department>) this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
        return list;
    }
}
