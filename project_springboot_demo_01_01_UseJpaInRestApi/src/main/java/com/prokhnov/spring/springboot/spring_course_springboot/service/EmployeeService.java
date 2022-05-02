package com.prokhnov.spring.springboot.spring_course_springboot.service;


import com.prokhnov.spring.springboot.spring_course_springboot.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    public List<Employee> showAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
