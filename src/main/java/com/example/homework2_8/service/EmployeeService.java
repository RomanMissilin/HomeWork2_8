package com.example.homework2_8.service;

import com.example.homework2_8.data.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String firstName, String lastName, int salary, int departmentId);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Collection<Employee> find();

    Collection<Employee> findAll();
}