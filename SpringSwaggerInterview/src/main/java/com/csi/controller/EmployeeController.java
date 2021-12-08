package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/savedata")
    public String saveData(@RequestBody Employee employee)
    {
        employeeService.saveData(employee);
        return "Data save successfully...!!!";
    }

    @GetMapping("/getdatabyid/{empId}")
    public Employee getDataById(@PathVariable int empId)
    {
        return employeeService.getDataByempId(empId);
    }

    @GetMapping("/getdatabyname/{empName}")
    public Employee getDataByName(@PathVariable String empName)
    {
        return employeeService.getDataByempName(empName);
    }

    @GetMapping("/getdatabylastname/{empLastName}")
    public Employee getDataByLastName(@PathVariable String empLastName)
    {
        return employeeService.getDataByempLastName(empLastName);
    }

    @GetMapping("/getdatabycontact/{empContact}")
    public Employee getDataByContact(@PathVariable long empContact)
    {
        return employeeService.getDataByContact(empContact);
    }

    @GetMapping("/getdatabyemailid/{empEmailID}")
    public Employee getDataByEmailID(@PathVariable String empEmailID)
    {
        return employeeService.getDataByempEmailId(empEmailID);
    }

}
