package com.ajinkyagrp.employeedlts;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees= new ArrayList<>();
    @Override
    public String createEmployee(Employee employee) {
        employees.add(employee);
        return "Saved Succesfully";
    }

    @Override
    public List<Employee> readEmployee() {
        return employees;
    }

    @Override
    public boolean deleteemployee(Long id) {
        employees.remove(id);
        return true;
    }
}
