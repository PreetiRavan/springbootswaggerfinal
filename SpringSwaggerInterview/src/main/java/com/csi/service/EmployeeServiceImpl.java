package com.csi.service;

import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDaoImpl;

    @Override
    public void saveData(Employee emp) {

        employeeDaoImpl.saveData(emp);
    }

    @Override
    public Employee getDataByempId(int empId) {

        return employeeDaoImpl.getDataByempId(empId);
    }

    @Override
    public Employee getDataByempName(String empName) {

        return employeeDaoImpl.getDataByempName(empName);
    }

    @Override
    public Employee getDataByempEmailId(String empEmailID) {

        return employeeDaoImpl.getDataByempEmailId(empEmailID);
    }

    @Override
    public Employee getDataByContact(long empContact) {

        return employeeDaoImpl.getDataByContact(empContact);
    }

    @Override
    public Employee getDataByempLastName(String empLastName) {

        return employeeDaoImpl.getDataByempLastName(empLastName);
    }
}
