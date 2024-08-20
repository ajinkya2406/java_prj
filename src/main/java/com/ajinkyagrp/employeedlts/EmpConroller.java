package com.ajinkyagrp.employeedlts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpConroller {

    List<Employee> employees= new ArrayList<>();
    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return employees;
    }

    @PostMapping("employees")
    public String createemployee(@RequestParam Employee employee){
        employees.add(employee);
        return "saved successfully";
    }
}
