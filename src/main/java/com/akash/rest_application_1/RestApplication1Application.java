package com.akash.rest_application_1;

import com.akash.rest_application_1.model.Employee;
import com.akash.rest_application_1.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApplication1Application {
    private static final Logger logger = LoggerFactory.getLogger(RestApplication1Application.class);
    public static void main(String[] args) {
        SpringApplication.run(RestApplication1Application.class, args);
    }
    @Bean
    public CommandLineRunner setup(EmployeeRepository employeeRepository) {
        return (args) -> {
            employeeRepository.save(new Employee("Gustavo", "Ponce", true));
            employeeRepository.save(new Employee("John", "Smith", true));
            employeeRepository.save(new Employee("Jim ", "Morrison", false));
            employeeRepository.save(new Employee("David", "Gilmour", true));
            logger.info("The sample data has been generated");
        };
    }
}
