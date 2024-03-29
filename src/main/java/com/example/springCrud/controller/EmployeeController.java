package com.example.springCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springCrud.model.Employee;
import com.example.springCrud.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
               return service.saveEmployee(employee);  
    }
    @PostMapping("/addListEmployee")
    public List<Employee> addListEmployee(@RequestBody List<Employee> listEmployee){
        return service.saveEmployee(listEmployee);
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }
    @GetMapping("/employeeN/{name}")
    public Employee getEmployeeById(@PathVariable String name){
        return service.getEmployeeByName(name);
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return service.getEmployee();
    }
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        System.out.println("done");
        return service.deleteEmployee(id);
    }


}
