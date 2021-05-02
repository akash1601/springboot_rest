package com.akash.rest_application_1.controller;

import com.akash.rest_application_1.model.Employee;
import com.akash.rest_application_1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable("id") long id) {
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping(value = "/employee/name", method = RequestMethod.GET)
    public Employee getEmployeeName() {
        return employeeService.getEmployeeName(2);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") long id){
        employeeService.deleteEmployee(id);
    }

}