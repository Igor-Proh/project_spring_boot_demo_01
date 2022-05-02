package com.prokhnov.spring.springboot.spring_course_springboot.dao;


import com.prokhnov.spring.springboot.spring_course_springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> showAllEmployees();

    public Employee getEmployeeById(int id);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(int id);

}
