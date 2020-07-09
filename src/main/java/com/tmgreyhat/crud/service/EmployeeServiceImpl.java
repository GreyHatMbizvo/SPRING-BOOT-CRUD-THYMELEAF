package com.tmgreyhat.crud.service;

import com.tmgreyhat.crud.models.Employee;
import com.tmgreyhat.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements  EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {


        return employeeRepository.findAll();
    }
}
