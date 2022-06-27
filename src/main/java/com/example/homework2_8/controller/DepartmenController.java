package com.example.homework2_8.controller;

import com.example.homework2_8.data.Employee;
import com.example.homework2_8.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmenController {

    private final DepartmentService departmentService;

    public DepartmenController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/min-salary")
    public Employee findPlayMinSalary(@RequestParam("departmentId") int departmentId) {
        return departmentService.findPlayMinSalary(departmentId);
    }

    @GetMapping("/max-salary")
    public Employee findPlayMaxSalary(@RequestParam("departmentId") int departmentId) {
        return departmentService.findPlayMaxSalary(departmentId);
    }

    @GetMapping("/all")
    public List<Employee> findAllDepartmentId(@RequestParam("departmentId") int departmentId) {
        return departmentService.findAllDepartmentId(departmentId);
    }

    @GetMapping(value = "/all")
    public Map<Integer, List<Employee>> findAllGroupedDepartment(@RequestParam("departmentId") int departmentId) {
        return departmentService.findAllGroupedDepartment();
    }
}