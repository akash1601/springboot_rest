package com.akash.rest_application_1.service;

import com.akash.rest_application_1.model.Employee;
import com.akash.rest_application_1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")

public class EmployeeServiceImpl implements EmployeeService{

    @Qualifier("employeeRepository")
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee getEmployeeName(long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
