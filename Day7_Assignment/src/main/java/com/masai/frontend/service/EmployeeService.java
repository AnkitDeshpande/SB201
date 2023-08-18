package com.masai.frontend.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.masai.frontend.model.Employee;

@Service
public class EmployeeService {
    private final Map<Long, Employee> employeeMap = new HashMap<>();
    private Long idCounter = 1L;

    public Employee addEmployee(Employee employee) {
        employee.setId(idCounter++);
        employeeMap.put(employee.getId(), employee);
        return employee;
    }

    public Employee updateEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        return employee;
    }

    public void deleteEmployee(Long id) {
        employeeMap.remove(id);
    }

    public List<Employee> getAllEmployees() {
        return employeeMap.values().stream().collect(Collectors.toList());
    }

    public Employee getEmployeeById(Long id) {
        return employeeMap.get(id);
    }
}
