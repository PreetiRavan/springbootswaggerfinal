package com.csi.service;

import com.csi.model.Employee;

public interface EmployeeService {

    public void saveData(Employee emp);

    public Employee getDataByempId(int empId);

    public Employee getDataByempName(String empName);

    public Employee getDataByempEmailId(String empEmailID);

    public Employee getDataByContact(long empContact);

    public Employee getDataByempLastName(String empLastName);
}
