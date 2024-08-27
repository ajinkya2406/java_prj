package com.ajinkyagrp.employeedlts;

import org.springframework.context.annotation.Bean;

import java.util.List;

public interface EmployeeService {
    @Bean
    String createEmployee(Employee employee);
    List<Employee> readEmployee();
    boolean deleteemployee(Long id);


}
