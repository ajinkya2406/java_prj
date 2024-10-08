package com.ajinkyagrp.employeedlts;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmpRepo empRepo;

  //  List<Employee> employees= new ArrayList<>();
    @Override
    public String createEmployee(Employee employee) {
        EmpEntity empEntity = new EmpEntity();
        BeanUtils.copyProperties(employee, empEntity);
        empRepo.save(empEntity);

       // employees.add(employee);
        return "Saved Successfully";
    }

    @Override
    public List<Employee> readEmployee() {
        List<EmpEntity> employeesList = empRepo.findAll();
        List<Employee> employees= new ArrayList<>();
        for (EmpEntity empEntity: employeesList){
            Employee emp = new Employee();
            emp.setName(empEntity.getName());
            emp.setEmail(empEntity.getEmail());

            employees.add(emp);
        }
        return employees;
    }

    @Override
    public boolean deleteemployee(Long id) {
        EmpEntity emp = empRepo.findById(id).get();
        empRepo.delete(emp);
       // employees.remove(id);
        return true;
    }

    @Override
    public String updateemployee(Long id, Employee employee) {
        EmpEntity exesistingEmp = empRepo.findById(id).get();

        exesistingEmp.setEmail(employee.getEmail());
        exesistingEmp.setName(employee.getName());
        exesistingEmp.setPhone(employee.getPhone());

        empRepo.save(exesistingEmp);
        //  empRepo.save(employee)
        return "update successfully";
    }

}
