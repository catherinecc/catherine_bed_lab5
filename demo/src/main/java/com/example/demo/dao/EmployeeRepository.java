package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

//this layer talks to the DB
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}