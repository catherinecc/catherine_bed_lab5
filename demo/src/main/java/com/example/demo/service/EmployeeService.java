package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	List<Employee> getAll();

	Employee save(Employee employee);

	Employee findById(int theId);

	void deleteById(int theId);

}
