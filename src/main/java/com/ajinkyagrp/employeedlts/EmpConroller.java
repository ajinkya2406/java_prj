package com.ajinkyagrp.employeedlts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpConroller {


   EmployeeService employeeService = new EmployeeServiceImpl();
    //Dependency injection
//    @Autowired
//    EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return employeeService.readEmployee();
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee){
        //employees.add(employee);
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(employeeService.deleteemployee(id))
            return "Delete Successfully";
        return "not found";
    }
}
