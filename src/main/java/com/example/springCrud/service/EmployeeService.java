package com.example.springCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springCrud.model.Employee;
import com.example.springCrud.repository.ProductRepo;

@Service
public class EmployeeService {
    @Autowired
    private ProductRepo repository;

    public Employee saveEmployee(Employee employee){
        return repository.save(employee);
    }
    public List<Employee> saveEmployee(List<Employee> employee){
        return repository.saveAll(employee);
    }
    public List<Employee> getEmployee(){
        return repository.findAll();
    }
    public Employee getEmployeeById(int id){
        return repository.findById(id).orElse(null);
    }
    public Employee getEmployeeByName(String name){
        return repository.findByName(name).orElse(null);
    }public String deleteEmployee(int id){
         repository.deleteById(id);
         return "Employee id"+id;
    }
    public Employee updateEmployee( Employee employee){
        Employee existingEmployee=repository.findById(employee.getId()).orElse(null);
        existingEmployee.setName(employee.getName());
        existingEmployee.setSalary(employee.getSalary());
        return repository.save(existingEmployee);
    }
}
