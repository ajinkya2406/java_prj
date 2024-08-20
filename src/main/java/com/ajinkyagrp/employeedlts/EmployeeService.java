package com.ajinkyagrp.employeedlts;

import java.util.List;

public interface EmployeeService {
    String createEmployee(Employee employee);
    List<Employee> readEmployee();
    boolean deleteemployee(Long id);


}
