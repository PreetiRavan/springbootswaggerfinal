package com.csi.dao;

import com.csi.model.Employee;

import java.util.*;

public interface EmployeeDao {

    public void saveData(Employee emp);

    public Employee getDataByempId(int empId);

    public Employee getDataByempName(String empName);

    public Employee getDataByempEmailId(String empEmailID);

    public Employee getDataByContact(long empContact);

    public Employee getDataByempLastName(String empLastName);

}
