package com.csi.dao;

import com.csi.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

    @Override
    public void saveData(Employee emp) {

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(emp);
        transaction.commit();
    }

    @Override
    public Employee getDataByempId(int empId) {

        Session session = factory.openSession();

        Employee   emp = (Employee) session.get(Employee.class,empId);

       return  emp;
    }

    @Override
    public Employee getDataByempName(String empName) {

        Session session = factory.openSession();

        Employee emp = new Employee();

        List<Employee> empList = session.createQuery("from Employee").list();

        for(Employee ee : empList)
        {
            if(ee.getEmpName().equals(empName))
            {
               emp.setEmpId(ee.getEmpId());
               emp.setEmpLastName(ee.getEmpLastName());
               emp.setEmpAddress(ee.getEmpAddress());
               emp.setEmpContact(ee.getEmpContact());
               emp.setEmpEmailId(ee.getEmpEmailId());
               emp.setEmpPassword(ee.getEmpPassword());
            }
        }
        return emp;
    }

    @Override
    public Employee getDataByempEmailId(String empEmailID) {

        Session session = factory.openSession();

        List<Employee> empList = session.createQuery("from Employee").list();

        Employee emp = new Employee();

        for(Employee ee : empList)
        {
            if(ee.getEmpEmailId().equals(empEmailID))
            {
                emp.setEmpId(ee.getEmpId());
                emp.setEmpName(ee.getEmpName());
                emp.setEmpLastName(ee.getEmpLastName());
                emp.setEmpAddress(ee.getEmpAddress());
                emp.setEmpContact(ee.getEmpContact());
                emp.setEmpPassword(ee.getEmpPassword());
            }
        }
        return emp;
    }

    @Override
    public Employee getDataByContact(long empContact) {

        Session session = factory.openSession();

        List<Employee> empList = session.createQuery("from Employee").list();

        Employee emp = new Employee();

        for(Employee ee : empList)
        {
            if(ee.getEmpContact()==empContact) {
                emp.setEmpId(ee.getEmpId());
                emp.setEmpName(ee.getEmpName());
                emp.setEmpLastName(ee.getEmpLastName());
                emp.setEmpAddress(ee.getEmpAddress());
                emp.setEmpEmailId(ee.getEmpEmailId());
                emp.setEmpPassword(ee.getEmpPassword());
            }
        }
        return emp;
    }

    @Override
    public Employee getDataByempLastName(String empLastName) {

        Session session = factory.openSession();

        List<Employee> empList = session.createQuery("from Employee").list();

        Employee emp = new Employee();

        for(Employee ee : empList)
        {
            if(ee.getEmpLastName().equals(empLastName))
            {
                emp.setEmpId(ee.getEmpId());
                emp.setEmpName(ee.getEmpName());
                emp.setEmpAddress(ee.getEmpAddress());
                emp.setEmpContact(ee.getEmpContact());
                emp.setEmpEmailId(ee.getEmpEmailId());
                emp.setEmpPassword(ee.getEmpPassword());
            }
        }
        return emp;
    }
}
