package com.akash.rest_application_1.service;
import com.akash.rest_application_1.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeById(long id);
    Employee getEmployeeName(long id);
    void deleteEmployee(long id);

    List<Employee> getAllEmployees();
}
