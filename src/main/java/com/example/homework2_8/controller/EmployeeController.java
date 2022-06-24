package com.example.homework2_8.controller;

import com.example.homework2_8.data.Employee;
import com.example.homework2_8.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String findName, @RequestParam String lastName) {
        return employeeService.add(findName, lastName);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam String findName, @RequestParam String lastName) {
        return employeeService.remove(findName, lastName);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String findName, @RequestParam String lastName) {
        return employeeService.find(findName, lastName);
    }

    @GetMapping
    public Collection<Employee> findAll() {
        return employeeService.findAll();
    }
}